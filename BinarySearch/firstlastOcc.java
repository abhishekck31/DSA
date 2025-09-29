public class firstlastOcc {
    public static int firstlastOcc(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        int ans = arr.length; 
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] >= target) {
                ans = mid;   
                high = mid - 1; 
            }
            else {
                low = mid + 1; 
            }
        }
        return ans;
    }
    public static void main(String[] args){
          int[] arr = {2, 3, 4, 10, 10, 10, 40};
          int target = 3;
          int result = firstlastOcc(arr, target);
          if(result  == -1){
                System.out.println("Element not found in the array");
          }else{
                System.out.println("First Occurrence of Element found at index: " + result);
        }
    }
}
