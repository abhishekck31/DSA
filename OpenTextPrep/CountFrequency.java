import java.util.*;
class CountFrequency{
public static void printfreq(String s) {
    if (s == null || s.isEmpty()) return;
    Map<Character, Integer> freqMap = new LinkedHashMap<>();
    for (char c : s.toCharArray()) {
        freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }
    freqMap.forEach((character, frequency) -> 
        System.out.println(character + ": " + frequency)
    );
}
    public static void main(String[] args){
        String s = "geeksforgeeks";
        printfreq(s);
    }
}