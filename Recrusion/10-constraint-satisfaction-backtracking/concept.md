# Constraint Satisfaction Backtracking

## Problem Statement
**N-Queens**: Place `N` queens on an `N x N` chessboard such that no two queens attack each other.
**Sudoku Solver**: Fill a 9x9 grid with digits so that each column, each row, and each of the nine 3x3 sub-boxes contain all digits from 1 to 9.

## Core Intuition
This is the ultimate form of backtracking. You have a board with strict global rules. You place a piece (a Queen, or a Sudoku number), and before proceeding, you check if it breaks ANY rules across the entire board. If it's safe, you recurse to the next row/cell. If it leads to an impossible state later on, you backtrack, pick up the piece, and try the next possible option.

## Recursion Tree / Trace
Example: 4-Queens
```
Row 0: Place Q at (0,0)
  Row 1: 
    Try (1,0) -> Attacked by column
    Try (1,1) -> Attacked by diagonal
    Try (1,2) -> SAFE! Place Q.
      Row 2:
        Try (2,0) -> Attacked
        Try (2,1) -> Attacked
        Try (2,2) -> Attacked
        Try (2,3) -> Attacked
        DEAD END! Backtrack Row 1 to try next column.
```

## Why this shape, not another
We use **Constraint Satisfaction** when the choices aren't just bounded by adjacent cells (like a maze), but by complex global validity rules (like diagonals or 3x3 grids). 

## Base Case Reasoning
For N-Queens, we place row by row, so the base case is `row == N`. For Sudoku, we move cell by cell, so the base case is moving past the last cell in the matrix.

## Common Bug(s)
**Checking safety incorrectly**:
For N-Queens, the diagonal check is famously tricky. 
**Symptom**: Queens are placed on the same diagonal.
**Root Cause**: Failing to check both the main diagonal and anti-diagonal. A mathematically beautiful way to check if `(r1, c1)` and `(r2, c2)` share a diagonal is: `Math.abs(r1 - r2) == Math.abs(c1 - c2)`.

## Full Java Solution
- [NQueens.java](NQueens.java)
- [MColoring.java](MColoring.java)
- [SudokuSolver.java](SudokuSolver.java)

## Complexity
**Time:** O(N!) for N-Queens. O(9^(81)) for Sudoku, though practically much faster due to constraints.
**Space:** O(N) for recursion stack.

## Connects To
Congratulations! Mastering this means you have the deep recursive intuition required to tackle Graph Algorithms (DFS, Bipartite matching) and dynamic programming state-transitions.
