# String Partitioning

## Problem Statement
**Palindrome Partitioning**: Given a string `s`, partition `s` such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of `s`.
Example: `s = "aab"` -> `[["a","a","b"], ["aa","b"]]`.

## Core Intuition
Imagine a long chocolate bar with letters on it. You have a knife. You place the knife after the 1st letter and chop. Is the left piece a palindrome? If yes, keep it, and recursively ask your friend to chop up the rest of the bar. Then, undo your chop, and try moving the knife to after the 2nd letter.

## Recursion Tree / Trace
Example: `"aab"`
```
Chop after index 0 ("a"): Palindrome!
  Remaining: "ab"
  Chop after index 1 ("a"): Palindrome!
    Remaining: "b"
    Chop after index 2 ("b"): Palindrome!
      Remaining: "" -> Base Case! Save ["a", "a", "b"]
  Chop after index 2 ("ab"): Not a palindrome. Backtrack.
Chop after index 1 ("aa"): Palindrome!
  Remaining: "b"
  Chop after index 2 ("b"): Palindrome!
    Remaining: "" -> Base Case! Save ["aa", "b"]
Chop after index 2 ("aab"): Not a palindrome. Backtrack.
```

## Why this shape, not another
This is **Partitioning**. Unlike combinations where we pick individual elements, here we are taking contiguous chunks of variable length. We use a `for` loop to represent "where to place the knife".

## Base Case Reasoning
The base case is `index == s.length()`. This means the knife has reached the very end of the chocolate bar, and all previous chunks were valid palindromes.

## Common Bug(s)
**Forgetting to copy the path list before adding to results**:
`result.add(path);` instead of `result.add(new ArrayList<>(path));`.
**Symptom**: The final list is full of empty arrays.
**Root Cause**: Java passes object references. If you don't copy the list at the base case, future backtracks (which `remove` elements from the path) will empty the exact list you saved in the result.

## Full Java Solution
- [PalindromePartitioning.java](PalindromePartitioning.java)

## Complexity
**Time:** O(N * 2^N) where N is the length of the string. The worst case is when all characters are the same.
**Space:** O(N) for recursion stack depth.

## Connects To
We've partitioned 1D strings. Now let's explore 2D grids: **Grid Backtracking**.
