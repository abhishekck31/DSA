public class Recrusion3 {
    public static void recrusion(int n){
        if ( n == 0){
            return;
        }
        System.out.println(n);
        recrusion(n-1);
    }
    public static void main(String[] args){
        recrusion(10);
    }
}
