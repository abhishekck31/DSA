import java.util.*;
class ReversalString{
    public static String reverse(String S){
        if(S==null || S.isEmpty()) return S;
        char[] arr = S.toCharArray();
        int left = 0 , right = arr.length - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    public static void main(String[] args){
        String S = "hello";
        System.out.println(reverse(S));
    }
}