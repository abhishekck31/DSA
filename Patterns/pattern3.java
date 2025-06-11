public class pattern3 {
    public static void patterns(int n){
        for(int i= 0;i<=n;i++){
            for(int j=0;j<=i;j++){
               System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        patterns(5);
    }
}
