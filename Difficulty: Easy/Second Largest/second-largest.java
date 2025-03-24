//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int getSecondLargest(int[] arr) {
        // Code Here
        int largest = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        
        int seclar = -1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>seclar && arr[i]<largest){
                seclar = arr[i];
            }
        }
        return seclar;
    }
    public static void main(String[] args){
        int arr[]={9,6,3,8,5,2,7,4,1};
        getSecondLargest(arr);
    }
}