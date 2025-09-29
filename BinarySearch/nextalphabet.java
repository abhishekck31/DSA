public class nextalphabet {
    public static char nextAlpha(char[] arr,char target){
        int low = 0;
        int high = arr.length - 1;
        char ans = ' ';
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans == ' ' ? arr[0] : ans;
        }
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        char target = 'c';
        char result = nextAlpha(arr, target);
        System.out.println("The next alphabet after " + target + " is: " + result);
    }
}
