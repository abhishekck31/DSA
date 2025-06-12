public class pattern12 {
    public static void pattern(int n){
        int num =1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num = num +1;
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
}
