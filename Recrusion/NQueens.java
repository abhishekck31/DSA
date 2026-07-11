import java.util.*;

class NQueens{
    public static boolean isSafe(int row , int col , int[] queen){
        for(int i = 0; i < row; i++){
            if(queen[i] == col || Math.abs(queen[i] - col) == Math.abs(i - row)){
                return false;
            }
        }
        return true;
    }
    public static void Nq(int row , int[] queen , int n){
        if(row == n){
            System.out.println(Arrays.toString(queen));
            return;
        }
        for(int col = 0; col < n; col++){
            if(isSafe(row, col, queen)){
                queen[row] = col;
                Nq(row + 1, queen, n);
                queen[row] = -1;
            }
        }
    }
    public static void main(String[] args){
        Nq(0, new int[8], 8);
    }   
}