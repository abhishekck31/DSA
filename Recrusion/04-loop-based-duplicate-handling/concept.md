# Loop-Based Duplicate Handling

## Problem Statement
**Combination Sum II**: Find all unique combinations that sum to target. Each number may only be used ONCE. The input array contains duplicates.
**Subsets II**: Return all possible subsets (power set). The input array contains duplicates.

## Core Intuition
Imagine picking players for a team from a sorted line of people: `[Alice, Bob1, Bob2]`. If you pick Alice, and then you want a team of 2, you can pick Bob1. `[Alice, Bob1]`. But if you skip Bob1 and pick Bob2, you get `[Alice, Bob2]`. Since Bob1 and Bob2 are identical twins with the exact same skills, these two teams are duplicates. 
To prevent this, if we are picking the *first* person for a specific slot on the team, and they are identical to the person standing right before them (who we just skipped), we shouldn't pick them either!

## Recursion Tree / Trace
Example: `[1, 1, 2]` generating subsets.
```
Level 0 (Choose 1st item):
  Pick index 0 (1) -> [1]
  Pick index 1 (1) -> SKIPPED! (i > index && arr[i] == arr[i-1])
  Pick index 2 (2) -> [2]

Level 1 (from [1]):
  Pick index 1 (1) -> [1, 1] (Valid, because i == index, it's the first choice of this level)
  Pick index 2 (2) -> [1, 2]
```

## Why this shape, not another
We use **Loop-Based Recursion** instead of binary Pick/Not-Pick when we need to gracefully skip duplicates. A loop lets us easily peek at the previous sibling element `arr[i-1]` in the same recursion level.

## Base Case Reasoning
For Combination Sum II, the base case is `target == 0`. For Subsets II, we just add the current path to the result *every single time* we enter the function (no base case return needed until the loop finishes), because every intermediate path is a valid subset.

## Common Bug(s)
**Over-skipping (The `[1,1,2]` counter-example)**:
If you just write `if (arr[i] == arr[i-1]) continue;` without `i > index`, you will skip picking the second `1` when you are explicitly trying to build `[1,1]`. 
**Symptom**: Missing valid arrays that legitimately contain duplicate numbers.
**Root Cause**: Failing to distinguish between a duplicate *vertical* pick (picking identical numbers in a sequence, which is allowed) vs a duplicate *horizontal* pick (picking identical numbers for the same slot in the sequence, which causes duplicate answers). The `i > index` guard ensures we only skip horizontal duplicates.

## Full Java Solution
- [CombinationSum2.java](CombinationSum2.java)
- [Subsets2.java](Subsets2.java)
- [CombinationSum3.java](CombinationSum3.java) (No duplicates in input, but adds dual constraints: exactly k elements AND target sum).

## Complexity
**Time:** O(2^N) generally, but drastically optimized by the duplicate skipping branches.
**Space:** O(N) for the stack depth.

## Connects To
Now that you can generate subsets and combinations, what if you just want to generate subsets of a *distinct* array? That's just **Subsets / Power Set**.
