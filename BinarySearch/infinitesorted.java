public class infinitesorted {
    public static int binarySearch(int arr[], int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; 
    }
    public static int eleininfinite(int[] arr, int target) {
        int low = 0;
        int high = 1;
        while (high < arr.length && target > arr[high]) {
            low = high;
            high = high * 2; 
        }
        int actualHigh = Math.min(high, arr.length - 1);
        return binarySearch(arr, target, low, actualHigh);
    }
    
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 100; 
        int result = eleininfinite(arr, target);
        
        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result); 
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}