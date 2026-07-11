class validparenthesis{
    public static void validp(int open , int close , int n , StringBuilder s){
        if( open + close == 2 * n){
            System.out.println(s);
            return;
        }
        if(open < n){
            s.append("(");
            validp(open + 1 , close , n , s);
            s.deleteCharAt(s.length() - 1);
        }
        if(close < open){
            s.append(")");
            validp(open , close + 1 , n , s);
            s.deleteCharAt(s.length() - 1);
        }
    }
    public static void main(String[] args){
            validp(0,0,3,new StringBuilder());
    }
}