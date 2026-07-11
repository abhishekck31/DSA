import java.util.*;

class lettercombination{
    public static void LetterComb(int index , String digits, String[] mapping,StringBuilder sb){
        if(index == digits.length()){
            System.out.println(sb);
            return;
        }
        char c = digits.charAt(index);
        String letters = mapping[c - '0'];
        for(int i = 0; i < letters.length(); i++){
            sb.append(letters.charAt(i));
            LetterComb(index + 1, digits, mapping, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    public static void main(String[] args){
        LetterComb(0, "23456789", new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}, new StringBuilder());
    }
}