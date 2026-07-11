class RatinMaze{
    public static void ratsinMaze(int[][] maze , int row , int col , int[][] sol){
        if(row == maze.length - 1 && col == maze.length - 1){
            sol[row][col] = 1;
            return;
        }
        if(row < 0 || col < 0 || row == maze.length || col == maze.length || maze[row][col] == 0 || sol[row][col] == 1){
            return;
        }
        sol[row][col] = 1;
        ratsinMaze(maze, row + 1, col, sol);
        ratsinMaze(maze, row - 1, col, sol);
        ratsinMaze(maze, row, col + 1, sol);
        ratsinMaze(maze, row, col - 1, sol);
        sol[row][col] = 0;
    }   
    public static void main(String[] args){
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int[][] sol = new int[maze.length][maze.length];
        ratsinMaze(maze, 0, 0, sol);
        for(int i = 0; i < maze.length; i++){
            for(int j = 0; j < maze.length; j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
}