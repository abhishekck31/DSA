public class MinimumDifference {
    public static int findMinDiff(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int minDiff = Integer.MAX_VALUE; // Initialize to a large value
        int closestElement = -1; // To store the element with the minimum difference

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Calculate the absolute difference between arr[mid] and target
            int currentDiff = Math.abs(arr[mid] - target);

            // Update minDiff and closestElement if a smaller difference is found
            if (currentDiff < minDiff) {
                minDiff = currentDiff;
                closestElement = arr[mid];
            }

            // Move the search range based on comparison
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                // Exact match found
                return arr[mid];
            }
        }

        return closestElement; // Return the element with the minimum difference
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10, 15};
        int target = 12;
        int result = findMinDiff(arr, target);
        System.out.println("Element with minimum difference to " + target + " is: " + result);
    }
}