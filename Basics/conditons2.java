import java.util.*;
public class conditons2 {
    public static void grading(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90){
            System.out.println("GRADE A");
        }else {
            if(marks >=70){
                System.out.println("GRADE B");
            } else {
                if(marks >=50){
                    System.out.println("GRADE C");
                }else{
                    System.out.println("GRADE D");
                }
            }
        }
        sc.close();
    }
    public static void main(String[] args){
        grading();
    }
}
