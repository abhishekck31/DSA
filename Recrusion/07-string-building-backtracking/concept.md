# String Building Backtracking

## Problem Statement
**Generate Parentheses**: Given `n` pairs of parentheses, write a function to generate all combinations of well-formed parentheses. Example: `n = 3` -> `["((()))","(()())","(())()","()(())","()()()"]`.
**Letter Combinations**: Given a string containing digits from 2-9, return all possible letter combinations that the number could represent.

## Core Intuition
You are typing a string one character at a time. For every slot, you have a set of characters you are legally allowed to type. You try typing one, recursively finish typing the rest of the string, and then hit `Backspace` (backtrack) to try the next legal character.

## Recursion Tree / Trace
Example: Generate Parentheses for `n = 2`
```
Start: "" (open=0, close=0)
  Try '(' -> "(" (open=1, close=0)
    Try '(' -> "((" (open=2, close=0)
      Try ')' -> "(()" (open=2, close=1)
        Try ')' -> "(())" (open=2, close=2) -> Base Case!
    Try ')' -> "()" (open=1, close=1)
      Try '(' -> "()(" (open=2, close=1)
        Try ')' -> "()()" (open=2, close=2) -> Base Case!
```

## Why this shape, not another
This is **String Building Backtracking**. It differs from subsets because we aren't just choosing "yes/no" on an array. We are looping over a variable-sized choice set at each step (e.g., 3-4 letters per digit, or '(' and ')').

## Base Case Reasoning
For Parentheses, the string is complete when `openCount + closeCount == 2 * n` (or when `string.length() == 2 * n`). For Letter Combinations, it's when `index == digits.length()`.

## Common Bug(s)
**Using `StringBuilder` but forgetting to delete**:
Using `StringBuilder` is faster than `String` concatenation, but you must manually undo your choice by deleting the last character: `sb.deleteCharAt(sb.length() - 1)`.
**Symptom**: The strings keep growing infinitely and look like `"a", "ab", "abc", "abcd..."`.
**Root Cause**: A `StringBuilder` mutates in place. If you don't undo, the branch that tries "c" still has the "b" from the previous branch attached to it.

## Full Java Solution
- [GenerateParentheses.java](GenerateParentheses.java)
- [LetterCombinationsPhone.java](LetterCombinationsPhone.java)

## Complexity
**Time:** Varies wildly. O(4^N) for phone keypad. O(4^N / sqrt(N)) for Parentheses (Catalan number).
**Space:** O(N) for the maximum depth of the string.

## Connects To
Instead of building a string character by character, what if we are given a full string and we need to cut it into pieces? That's **String Partitioning**.
