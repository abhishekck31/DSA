import java.util.*;

public class problem1 {
    public static int freqcnt(int arr[],int num){
        int freq = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                freq++;
            }
        }
        return freq;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int num = sc.nextInt();
        int result = freqcnt(arr, num);
        System.out.println("Frequency of " + num + " is: " + result);
    }
}
