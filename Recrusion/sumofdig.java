public class sumofdig {
    public int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumofdigits(n/10);
    }
    public static void main(String[] args) {
        sumofdig obj = new sumofdig();
        int result = obj.sumofdigits(465);
        System.out.println("Sum of digits: " + result);
    }
}
