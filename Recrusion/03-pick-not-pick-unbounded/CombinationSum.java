import java.util.*;

public class CombinationSum {
    
    public static void findCombinations(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
        if (index == candidates.length) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }
        
        // Pick the current element (unbounded reuse, so we stay at 'index')
        if (candidates[index] <= target) {
            current.add(candidates[index]);
            findCombinations(index, candidates, target - candidates[index], current, result);
            current.remove(current.size() - 1); // Backtrack
        }
        
        // Not-Pick the current element (move to 'index + 1')
        findCombinations(index + 1, candidates, target, current, result);
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = new ArrayList<>();
        
        findCombinations(0, candidates, target, new ArrayList<>(), result);
        
        System.out.println("Combinations for target " + target + ":");
        for (List<Integer> combo : result) {
            System.out.println(combo);
        }
    }
}
