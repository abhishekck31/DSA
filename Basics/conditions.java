import java.util.*;
public class conditions {
    public static void canvote(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        sc.close();

        if (age < 18){
            System.err.println("Cannot vote");
        }else {
            System.out.println("Can vote");
        }
    }
    public static void main(String[] args) {
        canvote();
    }
}
