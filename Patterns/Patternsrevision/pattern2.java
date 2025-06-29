public class pattern2 {
    public static void pattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
