# Common Bugs and Debugging Checklist

If you are stuck on a recursion problem, find your symptom below and ask yourself these questions:

## 1. Symptom: Infinite Recursion (StackOverflowError)
- **Check base case reachability**: Is it possible for the recursion to miss the base case?
- **Check index/counter shrinking**: Are you passing `index` instead of `index + 1`? (Only valid for unbounded reuse).
- **Check double vs int**: If dividing (e.g., `Pow(x, n)`), does it reach exactly `0`? Using `double n` never exactly reaches `0`.

## 2. Symptom: Wrong/Missing Results
- **Check backtracking (undo) placement**: Did you forget to remove the last element from your list after the recursive call returns?
- **Check list copying**: Are you doing `result.add(path)` instead of `result.add(new ArrayList<>(path))`? If you don't copy, all entries in the result will reflect the empty list at the end.
- **Check short-circuit logic**: Did you return `true` immediately upon finding one path when you were supposed to count *all* paths?

## 3. Symptom: Index Out of Bounds
- **Check bounds-check ordering**: In grid backtracking, are you evaluating `row < 0` BEFORE `grid[row][col] == '#'` using `||`? If you reverse them, it crashes.
- **Check loop bounds**: `for (int i = index; i < arr.length; i++)` vs `i <= arr.length`.

## 4. Symptom: Duplicate Answers
- **Check your guard condition**: In loop-based recursion with duplicates, did you include `i > index && arr[i] == arr[i - 1]`? Without `i > index`, you skip valid same-value-different-index picks.
- **Check array sorting**: Did you forget to sort the array before trying to skip adjacent duplicates?
