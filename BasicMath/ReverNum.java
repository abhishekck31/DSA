public class ReverNum {
    public static int revnum(int number) {
        int reverse = 0;
        while (number > 0) {
            int lastdigit = number % 10;
            reverse = (reverse * 10) + lastdigit;
            number = number / 10;
        }
        return reverse;
    }
    public static void main(String[] args){
        int result =  revnum(9658);
        System.out.println(result);
    }
}