public class AllDivisions {
    public static void divisions(int n){
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        divisions(36);
    }
}
