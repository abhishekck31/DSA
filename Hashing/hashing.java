public class hashing {
    public static int maxFreqEle(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return 0; // Handle empty array case
        }

        int maxFreq = 0;
        int maxEle = arr[0];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int freq = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    visited[j] = true;
                }
            }

            if (freq > maxFreq) {
                maxFreq = freq;
                maxEle = arr[i];
            } else if (freq == maxFreq) {
                maxEle = Math.min(maxEle, arr[i]);
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,9,6,3,2,5,4,7,8,2,1,4};
        int maxEle = maxFreqEle(arr);
        int freq = 0;
        for (int num : arr) {
            if (num == maxEle) freq++;
        }
        System.out.println("Highest Frequency Element is " + maxEle + " and the frequency is " + freq);
    }
}