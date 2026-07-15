class countSetBits{
    public static int countBits(long a  , long b){
        long product = (long) a * b;
        int count = 0;
        if(product < 0) product = -product;
        while(product != 0){
            product = product & ( product - 1 );
            count++;
        } 
        return count;
    }
    public static void main(String[] args){
        long a = -2;
        long b = -3;
        System.out.println(countBits(a,b));
    }
}