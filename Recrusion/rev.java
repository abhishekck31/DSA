public class rev {
    public static void main(String[] args) {
        int n = 8798;
        int r = 0;
        while(n!=0){
            r *= 10;
            r += n % 10;
            n /= 10;
        }
        System.out.println("Reversed Number: " + r);
    }
}
