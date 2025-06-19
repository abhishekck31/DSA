public class PalindromeChecker {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: if the start index crosses or meets the end index
        if (start >= end) {
            return true;
        }
        // If characters at start and end don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call with narrowed bounds
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "madam";  // Change this to test other inputs
        input = input.toLowerCase();  // Optional: make it case-insensitive

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
