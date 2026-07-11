# Foundations: Leap of Faith

## Problem Statement
**Factorial**: Calculate the factorial of a number `n` (n!). Example: Input: 4 -> Output: 24.
**Sum of N**: Calculate the sum of the first `N` natural numbers. Example: Input: 3 -> Output: 6.

## Core Intuition
The "Leap of Faith" means you must trust that a smaller version of the problem is already solved. If you want to find `factorial(4)`, pretend you already magically know `factorial(3)`. Your only job is to multiply your current number (`4`) by that magical result (`6`), giving `24`. You don't need to know *how* `factorial(3)` was computed, just trust that the function works.

## Recursion Tree / Trace
Example for `Sum of N` with `n=3`:
```
sum(3) -> 3 + sum(2)
              sum(2) -> 2 + sum(1)
                            sum(1) -> 1 + sum(0)
                                          sum(0) -> 0 (Base case)
```
- Step 1: `sum(0)` returns 0.
- Step 2: `sum(1)` computes `1 + 0 = 1`. Returns 1.
- Step 3: `sum(2)` computes `2 + 1 = 3`. Returns 3.
- Step 4: `sum(3)` computes `3 + 3 = 6`. Returns 6.

## Why this shape, not another
This uses a simple **linear recursion**. We just make one recursive call per function execution because the problem strictly depends on one smaller subproblem (`n-1`). It's the simplest shape.

## Base Case Reasoning
The base case is `n == 0` (or `n == 1`). If we didn't stop at 0, we'd multiply by 0 and ruin our factorial, or we'd go into negative numbers forever. The base case acts as the solid floor for our leap of faith.

## Common Bug(s)
**Forgetting the return statement**: Writing `factorial(n-1);` instead of `return n * factorial(n-1);`. 
**Symptom**: The code compiles (if void) or fails to compile (if expecting an int), but it doesn't pass the computed value back up the chain.
**Root Cause**: Not understanding that each stack frame needs to deliver its partial answer back to the caller.

## Full Java Solution
- [Factorial.java](Factorial.java)
- [SumN.java](SumN.java)

## Complexity
**Time:** O(N) because we make `N` recursive calls.
**Space:** O(N) due to the call stack depth holding `N` frames.

## Connects To
This prepares you for the **Pick/Not-Pick** pattern, where instead of making *one* leap of faith, you make *two* branches of leaps of faith.
