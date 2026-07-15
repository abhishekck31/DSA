import java.util.*;
class subarray0sum{
    public static boolean hasZeroSubarray(int[] arr){
        if(arr == null || arr.length == 0) return false;
        Set<Integer> seen = new HashSet<>();
        seen.add(0);
        int sum = 0;
        for(int num : arr){
            sum += num;
            if(seen.contains(sum)) return true;
            seen.add(sum);
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {4,2,-3,1,6};
        System.out.println(hasZeroSubarray(arr));
    }
}