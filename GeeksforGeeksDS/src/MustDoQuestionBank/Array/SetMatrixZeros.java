package MustDoQuestionBank.Array;

import java.util.Arrays;

public class SetMatrixZeros {

    public static void main(String[] args) {

         int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}} ;
          setZeroes(matrix);

    }


        public static void setZeroes(int[][] matrix) {
            boolean[][] visited = new boolean[matrix.length][matrix[0].length] ;
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[i].length;j++){

                    if(!visited[i][j] && matrix[i][j]==0){
                        visited[i][j]=true;
                        dfs(i,j,matrix,visited);
                    }
                }
            }
        }

        public static void dfs(int i,int j,int[][] matrix,boolean[][] visited){

            visited[i][j] = true ;
            matrix[i][j] = 0 ;
            System.out.println("i " +i + " j "+j);
            System.out.println(Arrays.deepToString(matrix));
            System.out.println(Arrays.deepToString(visited));
            int[] dx = {-1,1,0,0};
            int[] dy = {0,0,-1,1};
            for(int k=0;k<dx.length;k++){
                if(isSafe(i+dx[k],j+dy[k],matrix,visited)){
                    dfs(i+dx[k],j+dy[k],matrix,visited);
                }
            }
        }

        public static boolean isSafe(int i,int j,int[][] matrix,boolean[][] visited){
            if(i>=0 && i<matrix.length && j>=0 && j<matrix[i].length && !visited[i][j] && matrix[i][j]!=0){
                return true ;
            }
            return false ;
        }
    }

