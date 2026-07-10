class powerofx{
    public double power(double x , int n){
        if( n < 0 ) {
            return 1.0 / power(x, -n);
        }
        if( n == 0) return 1;
        
        if( n % 2 == 0){
            double half = power(x , n / 2);
            return half * half;
        }else{
            double half = power(x , n / 2);
            return x * half * half;
        }
    }
    public static void main(String[] args){
        double x = 2;
        int n = -2;
        powerofx p = new powerofx();
        System.out.println(p.power(x,n));
        return;
    }
}