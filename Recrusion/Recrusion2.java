public class Recrusion2 {
    public static void recrusion(int n){
        if (n== 0){
            return;
        }
        recrusion(n-1);
         System.out.println(n);
    }
    public static void main(String[] args){
        recrusion(10);
    }
}
