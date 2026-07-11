import java.util.*;

public class CombinationSum3 {
    
    public static void findCombinations(int index, int k, int target, List<Integer> current, List<List<Integer>> result) {
        // Base case: we picked exactly k numbers and target reached 0
        if (current.size() == k) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }
        
        // Loop through valid digits 1-9
        for (int i = index; i <= 9; i++) {
            // Optimization: if the current number is greater than target, stop (since remaining are larger)
            if (i > target) break;
            
            current.add(i);
            // Move to i + 1 because we cannot reuse digits
            findCombinations(i + 1, k, target - i, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        int k = 3, n = 9;
        List<List<Integer>> result = new ArrayList<>();
        
        findCombinations(1, k, n, new ArrayList<>(), result);
        
        System.out.println("Combinations (k=" + k + ", target=" + n + "):");
        for (List<Integer> combo : result) {
            System.out.println(combo);
        }
    }
}
