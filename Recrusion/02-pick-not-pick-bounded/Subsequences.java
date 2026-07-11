import java.util.*;

public class Subsequences {
    
    public static void generateSubsequences(int index, int[] arr, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        
        // Pick the current element
        current.add(arr[index]);
        generateSubsequences(index + 1, arr, current, result);
        
        // Not-Pick the current element (Backtrack)
        current.remove(current.size() - 1);
        generateSubsequences(index + 1, arr, current, result);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        List<List<Integer>> result = new ArrayList<>();
        generateSubsequences(0, arr, new ArrayList<>(), result);
        
        System.out.println("All subsequences:");
        for (List<Integer> sub : result) {
            System.out.println(sub);
        }
    }
}
