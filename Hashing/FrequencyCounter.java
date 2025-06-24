import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 3};

        // Create a HashMap to store frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Traverse the array
        for (int num : arr) {
            // If number already exists in map, increase its count
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
