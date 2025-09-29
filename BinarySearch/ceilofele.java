public class ceilofele {
    public static int ceil(int[] arr,int target){
        int low = 0 ;
        int high = arr.length - 1;
        int ans = -1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {2, 5, 9, 14, 16, 18};
        int target = 3;
        int result = ceil(arr,target);
        if (result != -1) {
            System.out.println("Ceil of " + target + " is " + arr[result]);
        } else {
            System.out.println("No ceil found for " + target);
        }
    }
}
