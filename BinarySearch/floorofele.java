public class floorofele {
    public static int floor(int[] arr,int target){
        int low = 0 , high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + ( high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int result = floor(arr, target);
        if (result != -1) {
            System.out.println("Floor of " + target + " is " + arr[result]);
        } else {
            System.out.println("No floor found for " + target);
        }
    }
}
