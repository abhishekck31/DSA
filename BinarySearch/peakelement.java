import java.util.*;
public class peakelement {
    public static int peak(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        List<Integer> peaks = new ArrayList<>();
        while(low <= high){
            int mid = low + (high - low) /2;
            if ((arr[mid] > arr[mid-1]) && (arr[mid] > arr[mid+1])) {
                peaks.add(mid);
                return mid;
            } else if (mid > 0 && arr[mid-1] > arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return peaks.isEmpty() ? -1 : peaks.get(0);
    }
    public static void main(String[] args){
        int arr[] = {1,3,5,7,9,10,11,12,4,2};
        int result = peak(arr);
        System.out.println("The peak element is at index: " + result);
    }
}
