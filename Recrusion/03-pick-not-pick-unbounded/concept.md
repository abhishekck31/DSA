# Pick / Not-Pick (Unbounded)

## Problem Statement
**Combination Sum**: Given an array of *distinct* integers and a target sum, find all unique combinations where the chosen numbers sum to the target. **The same number may be chosen an unlimited number of times.**
Example: Input: `candidates = [2,3,6,7], target = 7`. Output: `[[2,2,3], [7]]`.

## Core Intuition
This is the same cafeteria line as the Bounded Pick/Not-Pick, but with a twist: the food bins never run out! If you Pick an item, you don't step forward. You stand at the exact same bin, with the option to Pick it again. You only step forward when you decide to Not-Pick the item and move to the next bin.

## Recursion Tree / Trace
Example: `candidates = [2, 3]`, `target = 4`
```
                    (Start, index=0)
                   / Pick 2 (stay at 0) \ Not-Pick (move to 1)
           [2], sum=2                 [], sum=0
          /          \               /          \
     Pick 2(idx 0)  Not-Pick      Pick 3(idx 1)  Not-Pick
    [2,2], sum=4    [2], sum=2    [3], sum=3      [], sum=0
     (TARGET!)       ...             ...            ...
```

## Why this shape, not another
We use **Unbounded Pick/Not-Pick** when repetition of the exact same element is allowed. Notice that the "Pick" branch passes `index`, NOT `index + 1`.

## Base Case Reasoning
We stop when `sum == target` (success) or `sum > target` (failure). We also stop when `index == arr.length` (we reached the end of the line without hitting the target). We must check `sum == target` BEFORE checking if we reached the end of the array, or we might miss a valid combination at the very end.

## Common Bug(s)
**Infinite Recursion on Zero / Negative Numbers**: 
If the array contains `0` or negative numbers, picking them repeatedly doesn't increase the sum past the target, so `sum > target` is never reached, causing infinite recursion.
**Symptom**: StackOverflowError.
**Root Cause**: The bounded assumption that "picking an item always makes progress toward the ceiling" fails if items can be 0 or negative. (Unbounded problems usually constrain inputs to positive numbers for this reason).

## Full Java Solution
- [CombinationSum.java](CombinationSum.java)

## Complexity
**Time:** O(2^t) where `t` is the target value. The tree depth can be up to `target/min_element` if we keep picking the smallest element.
**Space:** O(target/min_element) for the recursion stack and the list holding the current path.

## Connects To
What if the input array *does* have duplicates, but we are *not* allowed to reuse the same element infinitely? That leads us to **Loop-Based Duplicate Handling**.
