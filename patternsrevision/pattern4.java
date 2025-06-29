public class pattern4 {
    public static void pattern(int n){
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}
