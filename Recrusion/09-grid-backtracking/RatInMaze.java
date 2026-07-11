class RatInMaze{
    public static boolean ratsinMaze(int[][] maze , int row , int col , int[][] sol){
        if(row == maze.length - 1 && col == maze.length - 1){
            sol[row][col] = 1;
            return true;
        }
        if(row < 0 || col < 0 || row == maze.length || col == maze.length || maze[row][col] == 0 || sol[row][col] == 1){
            return false;
        }
        
        sol[row][col] = 1; // Mark as part of solution path
        
        // Explore 4 directions
        if (ratsinMaze(maze, row + 1, col, sol)) return true;
        if (ratsinMaze(maze, row - 1, col, sol)) return true;
        if (ratsinMaze(maze, row, col + 1, sol)) return true;
        if (ratsinMaze(maze, row, col - 1, sol)) return true;
        
        sol[row][col] = 0; // Backtrack: Unmark because this path didn't work out
        return false;
    }   
    
    public static void main(String[] args){
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int[][] sol = new int[maze.length][maze.length];
        
        if (ratsinMaze(maze, 0, 0, sol)) {
            System.out.println("Path found:");
            for(int i = 0; i < maze.length; i++){
                for(int j = 0; j < maze.length; j++){
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No path found.");
        }
    }
}