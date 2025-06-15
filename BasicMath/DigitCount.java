public class DigitCount {
    public static int digit(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 25637542;
        int result = digit(number);
        System.out.println("Number of digits: " + result);
    }
}
