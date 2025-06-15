public class DigitConcp {
    public static void digit(int N) {
        while (N > 0) {
            int lastDigit = N % 10;
            System.out.println(lastDigit);  // Print each digit
            N = N / 10;  // Move to the next digit
        }
    }

    public static void main(String[] args) {
        int number = 7789;
        digit(number);
    }
}
