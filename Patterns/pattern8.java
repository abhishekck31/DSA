public class pattern8 {
    public static void pattern(){
        for(int i=0;i<4;i++){
            //space
            for(int j=0;j<7-i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<7-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        pattern();
    }
}
