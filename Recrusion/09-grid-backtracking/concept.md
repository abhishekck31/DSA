# Grid Backtracking

## Problem Statement
**Word Search**: Given an `m x n` grid of characters and a string `word`, return true if the word exists in the grid.
**Rat in a Maze**: Given an `N x N` matrix where `0` is a wall and `1` is an open path, find all paths from `(0,0)` to `(N-1,N-1)`.

## Core Intuition
You are dropped into a 2D maze. You look Up, Down, Left, and Right. You take a step into a valid adjacent square, leaving a "visited" breadcrumb behind so you don't walk in circles. You keep recursively stepping until you find the exit or complete the word. If you hit a dead end, you step back, pick up your breadcrumb (backtrack), and try a different direction.

## Recursion Tree / Trace
Example: Word Search for "AB" in a 2x2 grid.
```
Grid:
A B
C D

Start at (0,0) 'A': Matches! Mark visited ('#').
  Try Up: Out of bounds.
  Try Down: 'C' != 'B'.
  Try Left: Out of bounds.
  Try Right: (0,1) 'B' == 'B'. Matches! Mark visited ('#').
    Base case reached! "AB" found. Return true.
```

## Why this shape, not another
This is **Grid Backtracking** (often synonymous with DFS on a matrix). We have 4 discrete choices (directions) at every step, and we must manipulate coordinates `(r, c)`.

## Base Case Reasoning
1. **Success Base Case**: `index == word.length()` (Word Search) or `r == N-1 && c == N-1` (Rat in Maze).
2. **Failure Base Case (Bounds & Validity)**: `r < 0 || c < 0 || r >= rows || c >= cols || visited[r][c]`. We MUST check bounds *before* checking the array value to prevent `IndexOutOfBoundsException`.

## Common Bug(s)
**"Always Undo" silently breaking correctness (Word Search / Exist problem)**:
If you are asked "Does *any* path exist?" and you write:
```java
visited[r][c] = true;
boolean found = dfs(...) || dfs(...) || dfs(...) || dfs(...);
visited[r][c] = false; // Always undoing
return found;
```
This is actually correct for Word Search, because we *want* to undo if we fail, and if we succeed, the `true` ripples up. BUT if you write it poorly as 4 separate `if` statements without short-circuiting, and you unconditionally undo the visited state, you might erase a valid path.
**Symptom**: Code returns `false` or overwrites a solved maze grid with 0s.
**Root Cause**: Failing to use short-circuit evaluation (`||`) to immediately return `true` without executing the backtrack step. 

## Full Java Solution
- [WordSearch.java](WordSearch.java)
- [RatInMaze.java](RatInMaze.java)

## Complexity
**Time:** O(4^L) where L is the length of the word or path, because we explore 4 directions at each step.
**Space:** O(L) for the recursion stack depth.

## Connects To
Grid backtracking handles local, adjacent constraints. What if the constraints span the entire row, column, or diagonals? That is **Constraint Satisfaction**.
