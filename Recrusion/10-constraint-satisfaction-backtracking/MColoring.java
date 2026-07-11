import java.util.*;

public class MColoring {
    
    public static boolean isSafe(int node, int[] color, boolean[][] graph, int c) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] && color[i] == c) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean solveMColoring(int node, boolean[][] graph, int[] color, int m) {
        int n = graph.length;
        if (node == n) {
            return true; // All nodes are colored
        }
        
        for (int i = 1; i <= m; i++) {
            if (isSafe(node, color, graph, i)) {
                color[node] = i;
                if (solveMColoring(node + 1, graph, color, m)) {
                    return true;
                }
                color[node] = 0; // Backtrack
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        boolean[][] graph = {
            {false, true, true, true},
            {true, false, true, false},
            {true, true, false, true},
            {true, false, true, false}
        };
        
        int[] color = new int[n];
        if (solveMColoring(0, graph, color, m)) {
            System.out.println("Graph can be colored with " + m + " colors: " + Arrays.toString(color));
        } else {
            System.out.println("Graph cannot be colored with " + m + " colors.");
        }
    }
}
