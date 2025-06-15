public class AmstrongNum {
    public static int amst(int n){
        int sum = 0;
        int original = n;
        int digits = String.valueOf(n).length();

        while(n>0){
            int lastdigit = n % 10;
            sum += Math.pow(lastdigit, digits);
            n = n / 10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int n = 1634;
        int result = amst(n);
        if( n == result){
           System.out.print("Give is an Amstrong number ");
        }
        else {
            System.out.print("Given is not an Amstrong number ");
        }
        System.out.println("Calculated cube sum: " + result);
    }
}
