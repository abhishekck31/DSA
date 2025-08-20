public class print1toN {
    public static void print12N(int n){
        if(n==0) return;
        print12N(n-1);
        System.out.println(n +" ");
    }
    public static void main(String[] args) {
         int n = 10;
        // Printing 1 to N
        print12N(n);
    }
}
