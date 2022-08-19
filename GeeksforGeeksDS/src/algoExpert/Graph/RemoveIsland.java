package algoExpert.Graph;

public class RemoveIsland {

    public static void main(String[] args) {
          int[][] matrix = {
                  {1, 0, 0, 0, 0, 0},
                  {0, 1, 0, 1, 1, 1},
                  {0, 0, 1, 0, 1, 0},
                  {1, 1, 0, 0, 1, 0},
                  {1, 0, 1, 1, 0, 0},
                  {1, 0, 0, 0, 0, 1}
};

          removeIslands(matrix);

    }

    public static int[][] removeIslands(int[][] matrix) {
        // Write your code here.
        // iterate through the edges
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        int n = matrix.length;
        int m = matrix[0].length;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && matrix[i][j] == 1) {
                    dfs(matrix, visited, i, j);
                } else if (j == m - 1 && matrix[i][j] == 1) {
                    dfs(matrix, visited, i, j);
                } else if (i == n - 1 && matrix[i][j] == 1) {
                    dfs(matrix, visited, i, j);
                } else if (j == 0 && matrix[i][j] == 1) {
                    dfs(matrix, visited, i, j);
                }
            }
        }


        for(int i=0;i<n;i++){
            for(int j= 0;j<m;j++){
                if(matrix[i][j]==1 && !visited[i][j]){
                    matrix[i][j] = 0;
                }

            }
        }


        return matrix;
    }

    public static void dfs(int[][] matrix, boolean[][] visited, int i, int j) {

        visited[i][j] = true;
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        for (int k = 0; k < dx.length; k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (isSafe(matrix, visited, x, y)) {
                dfs(matrix, visited, x, y);
            }
        }
    }

    public static boolean isSafe(int[][] matrix, boolean[][] visited, int x, int y) {

        return x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length && !visited[x][y] && matrix[x][y] == 1;
    }


}
