class wordsearch{
    public static boolean wss(char[][] board , String word, int index, int row, int col){
        if(index == word.length()){
            return true;
        }
        if(row < 0 || col < 0 || row == board.length || col == board[0].length || board[row][col] != word.charAt(index) || board[row][col] == '#'){
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#';
        boolean found = wss(board, word, index + 1, row + 1, col) || wss(board, word, index + 1, row - 1, col) || wss(board, word, index + 1, row, col + 1) || wss(board, word, index + 1, row, col - 1);
        board[row][col] = temp;
        return found;
    }
    public static boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(wss(board, word, 0, i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println("Word exists: " + exist(board, word));
    }
}