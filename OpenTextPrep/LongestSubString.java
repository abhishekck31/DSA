import java.util.*;
class LongestSubString{
    public static int longestUniqueSubString(String s){
        if (s == null || s.isEmpty()) return 0;
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int maxlen = 0 , start = 0;
        for(int end = 0 ; end < s.length() ; end++){
            char c = s.charAt(end);
            if(map.containsKey(c) && map.get(c) >= start){
                start = map.get(c) + 1;
            }
            map.put(c,end);
            maxlen = Math.max(maxlen, end - start + 1);
        }
        return maxlen;
    }
    public static void main(String[] args){
        String s = "pwwkew";
        System.out.println(longestUniqueSubString(s));
    }
}