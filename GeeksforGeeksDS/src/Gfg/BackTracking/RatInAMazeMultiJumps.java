package Gfg.BackTracking;

public class RatInAMazeMultiJumps {

    public static void main(String[] args) {

        int[][] maze = new int[][]{{2,1,0,0},{3,0,0,1},
        {0,1,0,1},{0,0,0,1}} ;
        solve(maze,maze.length);
    }


    public static void solve(int[][] maze, int N)
    {
        // add your code here
        int[][] result = new int[N][N];
        if(getMaze(result,maze,N,0,0)){
            print(result,N);
        }  else {
            System.out.println(-1);
        }
    }

    private static boolean getMaze(int[][] result,int[][] maze,int N,int x,int y){

        if(x==N-1 && y==N-1){
            return true ;
        }

        if(isSafe(x,y,N,maze)){
            System.out.println("x "+x+"y "+y);
            result[x][y] = 1 ;
            if(getMaze(result,maze,N,x,y+maze[x][y])){
                return true ;
            }else if(getMaze(result,maze,N,x+maze[x][y],y)){
                return true ;
            }
            result[x][y] = 0;
        }
        return false ;
    }


    private static boolean isSafe(int i,int j,int N,int[][] maze){

        if(i>=0 && i<N && j>=0 && j<N && maze[i][j] != 0){
            return true ;
        }
        return false ;
    }


    private static void print(int[][] result,int N){

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(result[i][j]+" ") ;
            }
            System.out.println();
        }


    }




}
