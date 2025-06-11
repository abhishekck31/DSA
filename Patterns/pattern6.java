public class pattern6 {
    public static void pattern(){
        for(int i=0;i<5;i++){
            for(int j=1;j<5-i+1;j++){
               System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        pattern();
    }
}
