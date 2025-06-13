public class pattern13 {
    public static void pattern(int n){
         for(int i=0;i<=n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println("");
         }

    }
    public static void main(String[] args){
        pattern(5);
    }
}


