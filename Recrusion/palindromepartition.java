import java.util.*;

class palindromepartition{
    public static boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public static void findPartitions(int index, String s, List<String> path, List<List<String>> result){
        if(index == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                path.add(s.substring(index, i + 1));
                findPartitions(i + 1, s, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args){
        String s = "aab";
        List<List<String>> result = new ArrayList<>();
        findPartitions(0, s, new ArrayList<>(), result);
        
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}