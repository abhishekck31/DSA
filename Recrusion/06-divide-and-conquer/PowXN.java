import java.util.*;
public class pow {
    // Recursive function to calculate x^n
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
        System.out.println(x + " raised to the power " + n + " is: " + power(x, n));
    }
}