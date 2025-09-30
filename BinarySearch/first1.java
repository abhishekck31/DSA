public class first1 {
    public static int binarySearch(int arr[], int target, int low, int high) {
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid; 
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result; 
    }
    public static int firstone(int[] arr, int target) {
        int low = 0;
        int high = 1;
        while (high < arr.length && target > arr[high]){
            low = high;
            high = high * 2;
        }
        return binarySearch(arr, target, low, Math.min(high, arr.length - 1));
    }
    
    public static void main(String[] args){
        int arr[] ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1};
        int target = 1;
        int result = firstone(arr, target);
        
        if(result != -1){
            System.out.println("First occurrence of " + target + " is at index: " + result);
        } else{
            System.out.println("Element not found");
        }
    }
}