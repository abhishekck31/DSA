import java.util.*;
class largestNumberposneg{
    public static int largestNumberwithBothSigns(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int num : arr) set.add(num);
        int result = -1;
        for ( int num : arr){
            if(num > 0 && set.contains(-num)){
                result = Math.max(result,num);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {3,2,-3,1,-1,0,4};
        System.out.println(largestNumberwithBothSigns(arr));
    }
}