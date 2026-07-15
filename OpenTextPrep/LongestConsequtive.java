import java.util.*;
class LongestConsequtive{
    public static int longestCon(int[] nums){
        if(nums == null || nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int maxLen = 0;

        for(int n : set){
            if(!set.contains(n-1)){
                int length = 1;
                while(set.contains(n + length)) length++;
                maxLen = Math.max(maxLen,length);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestCon(nums));
    }
}