public class Sumoffirstn {
    public static int sumof(int n){
        if ( n == 0){
            return 0;
        }
        return n+sumof(n-1);
    }
    public static void main(String[] args){
        int result = sumof(5);
        System.out.println("Sum = "+ result);
    }
}
