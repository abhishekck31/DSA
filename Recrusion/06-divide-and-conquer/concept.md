# Divide and Conquer

## Problem Statement
**Pow(x, n)**: Implement `pow(x, n)`, which calculates `x` raised to the power `n` (i.e., x^n).
Example: Input `x = 2.0, n = 10` -> Output `1024.0`.

## Core Intuition
If you want to calculate `2^10`, you could multiply `2` by itself 10 times (O(N)). But mathematically, `2^10` is just `2^5 * 2^5`. If you find `2^5` once, you just multiply it by itself! And `2^5` is `2 * 2^2 * 2^2`. We divide the problem in half at every step.

## Recursion Tree / Trace
Example: `pow(2, 5)`
```
pow(2, 5): n is odd, return 2 * pow(2, 2) * pow(2, 2)
  -> pow(2, 2): n is even, return pow(2, 1) * pow(2, 1)
     -> pow(2, 1): n is odd, return 2 * pow(2, 0) * pow(2, 0)
        -> pow(2, 0): returns 1.
```

## Why this shape, not another
This is **Divide and Conquer**. We use it when a problem can be broken down into identical, non-overlapping subproblems that are fractions of the original size.

## Base Case Reasoning
The base case is `n == 0`, returning `1.0`. Anything to the power of 0 is 1.

## Common Bug(s)
**Silent degradation to O(N)**:
Writing `return pow(x, n/2) * pow(x, n/2);`.
**Symptom**: Code works but gets Time Limit Exceeded (TLE) on large inputs.
**Root Cause**: You didn't save the result of `pow(x, n/2)`. You are calculating the exact same heavy function call twice. It ruins the O(log N) optimization and turns it into O(2^(log N)) which is just O(N).
**Fix**: `double half = pow(x, n/2); return half * half;`.

**Infinite Recursion with Doubles**:
If you cast `n` to a double before dividing to "prevent truncation", `n` never hits exactly `0`.
**Symptom**: Stack Overflow.
**Root Cause**: `0.5 / 2 = 0.25`, never hitting `0.0` exactly. `n` must stay an integer.

## Full Java Solution
- [PowXN.java](PowXN.java)

## Complexity
**Time:** O(log N) because we halve the exponent at each step.
**Space:** O(log N) for the recursion stack.

## Connects To
Moving away from pure math, what if we use recursion to build up strings character by character? That's **String Building Backtracking**.
