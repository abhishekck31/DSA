import java.util.*;
public class fact {
    static int facto(int n){
        if (n <= 1){
            return 1;
        }

        return n * facto(n - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int ans = facto(sc.nextInt());
        System.out.println(ans);
    }
}
