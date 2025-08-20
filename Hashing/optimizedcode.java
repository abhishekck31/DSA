import java.util.*;

public class optimizedcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count frequencies using HashMap
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.print("Enter the number to find frequency: ");
        int key = sc.nextInt();
        int freq = freqMap.getOrDefault(key, 0);
        System.out.println("Frequency of " + key + " is: " + freq);
    }
}