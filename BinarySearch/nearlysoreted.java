public class nearlysoreted {
    public static int nearlysorted(int[] arr, int target){
        int low = 0 ; 
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            
            // Check mid
            if(arr[mid] == target){
                return mid;
            }
            // Check mid-1
            else if(mid - 1 >= low && arr[mid-1] == target){
                return mid - 1;
            }
            // Check mid+1
            else if(mid + 1 <= high && arr[mid + 1] == target){
                return mid + 1;
            }
            // Update search bounds
            else if(arr[mid] > target){
                high = mid - 2;  // Search left half (skip mid-1 as already checked)
            }
            else{
                low = mid + 2;   // Search right half (skip mid+1 as already checked)
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 10, 10, 40};
        int target = 2;
        int result = nearlysorted(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}