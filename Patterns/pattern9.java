public class pattern9 {
    public static void pattern(){
        for(int i=0;i<6;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*6 - (2*i + 1);  j++){
              System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print("");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        pattern();
    }
}
