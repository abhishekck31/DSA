class printx{
    public static void printxntimes(int x , int n){
        if(n==0) return ;
        System.out.println(x + " ");
        printxntimes(x,n-1);
    }
    public static void main(String[] args){
        printxntimes(5, 6);
    }
}