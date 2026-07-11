# Subsets / Power Set

## Problem Statement
**Subsets I**: Given an integer array of *unique* elements, return all possible subsets (the power set). Example: `[1,2]` -> `[], [1], [2], [1,2]`.

## Core Intuition
A subset is mathematically identical to a subsequence when we don't care about the final order. If you have 3 items, generating all subsets is just saying "yes" or "no" to each item. This is the exact same concept as Pattern #2 (Pick/Not-Pick Bounded).

## Recursion Tree / Trace
You can use either the Pick/Not-Pick approach or the Loop approach.
Loop approach trace for `[1, 2]`:
```
Start []
 Loop i=0 to 1:
   i=0: Add 1 -> [1]
        Recurse(index=1):
          Loop i=1 to 1:
            i=1: Add 2 -> [1, 2]
                 Recurse(index=2) -> loops don't run
                 Remove 2 -> [1]
        Remove 1 -> []
   i=1: Add 2 -> [2]
        Recurse(index=2) -> loops don't run
        Remove 2 -> []
```

## Why this shape, not another
You can literally use Pattern 2 (Binary Pick/Not-Pick) or Pattern 4 (Loop-based). They compile to the exact same tree structure in memory. Loop-based is generally preferred if you might add duplicate constraints later.

## Base Case Reasoning
If using the loop-based shape, you don't even need an explicit `return` base case. You just add the current subset to the result at the very start of the function call, and the `for` loop naturally terminates when `index == arr.length`.

## Common Bug(s)
**Forgetting to copy the list**:
`result.add(path);` instead of `result.add(new ArrayList<>(path));`.
**Symptom**: You get a list of empty arrays: `[[], [], [], []]`.
**Root Cause**: Java passes objects by reference. `path` points to a single memory location. You add that location to `result` 4 times. By the end of the backtracking, `path` is emptied out. So `result` contains 4 pointers to the same empty list.

## Full Java Solution
- [Subsets1.java](Subsets1.java)

## Complexity
**Time:** O(N * 2^N) to generate 2^N subsets, and O(N) to copy each subset to the result list.
**Space:** O(N) for the recursion stack.

## Connects To
Next, we shift gears from combinatorial generation to mathematical halving: **Divide and Conquer**.
