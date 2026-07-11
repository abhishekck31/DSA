import java.util.*;

public class Subsets1 {
    
    public static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result at every step
        result.add(new ArrayList<>(current));
        
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(i + 1, nums, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        
        generateSubsets(0, nums, new ArrayList<>(), result);
        
        System.out.println("Power Set:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
