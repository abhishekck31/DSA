public class Palindrome {
    public static int palidro(int n) {
        int reverse = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            reverse = (reverse * 10) + lastdigit;
            n = n / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n = 1891;
        int result = palidro(121);
        if (n == result) {
            System.out.print("Given number is a palindrome");
        } else {
            System.out.print("Given number is not a palindrome");

        }
    }
}
