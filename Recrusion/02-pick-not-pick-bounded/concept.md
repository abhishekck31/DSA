# Pick / Not-Pick (Bounded)

## Problem Statement
**Subsequences**: Given an array, generate all possible subsequences (maintaining relative order). Example: `[3,1,2]` -> `[], [3], [1], [2], [3,1], [3,2], [1,2], [3,1,2]`.
**Subsequence Sum K**: Find if *any* subsequence sums to `K`, or count *all* subsequences that sum to `K`.

## Core Intuition
Imagine walking down a cafeteria line with a tray. For every single food item (element in the array), you have a binary choice: **Pick it** and put it on your tray, or **Not-Pick it** and walk past. You make this choice independently for every item. Once you reach the end of the line, you look at what's on your tray—that's one subsequence.

## Recursion Tree / Trace
Example for array `[3, 1]` generating subsequences:
```
Index 0 (Item 3):
                / (Pick 3)          \ (Not-Pick 3)
         Tray=[3]                   Tray=[]
        /           \              /           \
Index 1 (Item 1):
  (Pick 1)   (Not-Pick 1)     (Pick 1)    (Not-Pick 1)
  Tray=[3,1] Tray=[3]         Tray=[1]    Tray=[]
```
State added: The current item is added to the tray.
State removed: The current item is removed from the tray during the backtrack (Not-Pick).

## Why this shape, not another
This is the **binary pick/not-pick** shape. It is specifically designed for generating combinations/subsequences where each element is distinct and can be used at most once (bounded). We use this instead of a loop when the choices are strictly binary.

## Base Case Reasoning
The base case is `index == arr.length`. Why? Because we only check if our tray is valid *after* we have made a decision (Pick or Not-Pick) for every single item in the cafeteria line. If we stopped at `index == arr.length - 1`, we would miss the decision for the very last element.

## Common Bug(s)
**Short-circuit vs Explore All**: 
If the problem says "Does *any* subsequence sum to K?", you should return `true` immediately and stop. 
If the problem says "Count *all* subsequences", and you return `true` immediately upon hitting the sum, you miss other valid subsequences further down the tree.
**Root cause**: Confusing a search problem (finding one valid state) with an exhaustive generation problem (counting/collecting all valid states).

## Full Java Solution
- [Subsequences.java](Subsequences.java)
- [SubsequenceSumK.java](SubsequenceSumK.java)

## Complexity
**Time:** O(2^n) because each of the `n` elements independently doubles the branch count (2 choices each).
**Space:** O(n) for the maximum depth of the recursion stack (which equals the length of the array).

## Connects To
This prepares you for **Unbounded Pick**, where the cafeteria line lets you take an infinite amount of the *same* item.
