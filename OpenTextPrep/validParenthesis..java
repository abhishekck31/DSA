import java.util.*;
class validParenthsis{
    public static boolean isValidParentheses(String s) {
    if (s == null) return true;
    Deque<Character> stack = new ArrayDeque<>();
    Map<Character, Character> pairs = Map.of(')', '(', ']', '[', '}', '{');
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else if (pairs.containsKey(c)) {
            if (stack.isEmpty() || stack.pop() != pairs.get(c)) return false;
        }
    }
    return stack.isEmpty();
}
    public static void main(String[] args){
        String s = "({[()]})";
        System.out.println(isValidParentheses(s));
    }
}