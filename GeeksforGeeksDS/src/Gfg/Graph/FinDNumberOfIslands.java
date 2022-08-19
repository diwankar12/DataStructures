package Gfg.Graph;


public class FinDNumberOfIslands {

    public static void main(String[] args) {
        //grid = {{0,1},{1,0},{1,1},{1,0}}
        char[][] grid = new char[][]{{0,1,1,1,0,0,0},{0,0,1,1,0,1,0}};//{{0,1},{1,0},{1,1},{1,0}};
        System.out.println(numIslands(grid));

    }
    //Function to find the number of islands.
    public static int numIslands(char[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int islands = 0;
        boolean[][] visited = new boolean[R][C];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    islands++;
                    dfs(i, j, visited, R, C, grid);
                }
            }
        }
        return islands;
    }

    public static void dfs(int x, int y, boolean[][] visited, int R, int C, char[][] grid) {

        visited[x][y] = true;
        if (isSafe(x + 1, y, R, C, grid, visited)) {
            dfs(x + 1, y, visited, R, C, grid);
        }
        if (isSafe(x - 1, y, R, C, grid, visited)) {
            dfs(x - 1, y, visited, R, C, grid);
        }
        if (isSafe(x, y + 1, R, C, grid, visited)) {
            dfs(x, y + 1, visited, R, C, grid);
        }
        if (isSafe(x, y - 1, R, C, grid, visited)) {
            dfs(x, y - 1, visited, R, C, grid);
        }
        if (isSafe(x-1, y +1, R, C, grid, visited)) {
            dfs(x-1, y +1, visited, R, C, grid);
        }
        if (isSafe(x-1, y - 1, R, C, grid, visited)) {
            dfs(x-1, y - 1, visited, R, C, grid);
        }
        if (isSafe(x+1, y - 1, R, C, grid, visited)) {
            dfs(x+1, y - 1, visited, R, C, grid);
        }
        if (isSafe(x+1, y +1, R, C, grid, visited)) {
            dfs(x+1, y +11, visited, R, C, grid);
        }

        // x-1,y+1
        //x-1,y-1
        //x+1 , y-1
        //x+1 ,y+1
    }

    public static boolean isSafe(int x, int y, int R, int C, char[][] grid, boolean[][] visited) {
        return (x >= 0 && x < R && y >= 0 && y < C) && (grid[x][y] == 1) && (visited[x][y] == false);
    }
}