package Gfg.BackTracking;

public class RatInAMaze {

     public static void main(String[] args) {
          int[][] maze = new int[][]{{1,0,0,0},{1,1,1,1},
                  {1,0,1,1},{0,0,0,1}};
          getMaze(maze);
     }


     public static boolean getMaze(int[][] maze){

          int[][] result = new int[maze.length][maze[0].length] ;
           if(solveMaze(maze,result,0,0,maze.length,maze[0].length)){
                printMatrix(result);
                return true ;
           } else {
                return false ;
           }

     }

     private static void printMatrix(int[][] result) {
          for(int i=0;i<result.length;i++){
               for(int j=0;j<result[i].length;j++){
                    System.out.print(result[i][j]+" ");
               }
               System.out.println();
          }
     }


     public static boolean solveMaze(int[][] maze,int[][] result,int i , int j,int row,int column){

          // right or go downward

          if(i==row-1 && j==column-1){
               result[i][j] = 1 ;
               return true ;
          }

          if(isSafe(maze,i,j,row,column)){
               result[i][j] = 1 ;
               if(solveMaze(maze,result,i+1,j,row,column)) return true ;
               else if (solveMaze(maze,result,i,j+1,row,column)) return true ;
               result[i][j] = 0 ;
          }
         return false  ;
     }

     private static boolean isSafe(int[][] maze, int i, int j,int row,int column) {

          if(i<row && i>=0 && j>=0 &&j<column && maze[i][j]==1){
               return true;
          }
          return false ;
     }


}
