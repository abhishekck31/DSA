class student {
    static int age;
}
 public class Staticvariable{
    public static void main(String args[]){
        student s1 = new student();
        student s2 = new student();
        s1.age = 24;
        s2.age = 25;
        System.out.println("Student 1 age is : "+ s1.age);
        System.out.println("Student 2 age is : "+ s2.age);
    }
 }
