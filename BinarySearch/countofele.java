public class countofele {
    public static int firstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Find last occurrence of target
    public static int lastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 10, 10, 40};
        int target = 10;
        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);
        if (first == -1 || last == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("the count of the given element is " + (last - first + 1));
        }
    }
}
