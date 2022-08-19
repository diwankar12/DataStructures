package Gfg.Graph;

public class FinDPathExist {

    public static void main(String[] args) {

        int[][] input = new int[][] {{3,2,3,3,3,3,0},
                {0,0,0,3,3,3,3},
                {0,0,3,0,1,3,0},
                {3,3,0,0,0,3,3},
                {0,3,3,3,3,3,3},
                {3,0,3,3,0,0,3},
                {3,3,0,3,0,3,3}}  ;


       // int[][] input = new int[][]{{1,3},{3,2}};
        System.out.println( is_Possible(input));
     //is_Possible(input);
}

    public static boolean is_Possible(int[][] grid)
    {

        int R = grid.length;
        int C = grid[0].length ;
        boolean isPossible = false ;
        boolean[][] isVisited = new boolean[R+1][C+1];
        for(int i=0;i<R;i++){

            for(int j=0;j<C;j++){

                if(grid[i][j]==1){

                    isPossible =  dfs(i,j,R,C,isVisited,grid);
                    return isPossible ;
                }
            }
        }
        return false ;
    }

    public static boolean dfs(int x,int y,int R,int C,boolean[][] isVisited,int[][] grid){

        isVisited[x][y] = true ;
//        if(isSafe(x,y,R,C,grid,isVisited)){
//             return true ;
//        }

        if(!isSafe(x,y,grid,R,C,isVisited))
            return false;

        if(grid[x][y]==2) {
            return true;
        }

        boolean up = dfs(x+1,y,R,C,isVisited,grid);
        boolean down = dfs(x,y+1,R,C,isVisited,grid);
        boolean  right = dfs(x-1,y,R,C,isVisited,grid);
        boolean left = dfs(x,y-1,R,C,isVisited,grid);

        return up || down || right || left ;
    }


    public boolean  isPath(int[][] grid, int x,int y,int n, int m,boolean[][] v){
        if(!isSafe(x,y,grid,n,m,v))
            return false;
        if(grid[x][y]==2 )
            return true;
        v[x][y]=true;
        return (( isPath(grid,x+1,y,n,m,v))||
                (isPath(grid,x,y+1,n,m,v))||
                (isPath(grid,x-1,y,n,m,v))||
                (isPath(grid,x,y-1,n,m,v)));
    }








    public static boolean isSafe(int x,int y,int[][] grid,int n, int m,boolean[][] v){
        if(x>n-1 || y>m-1||x<0||y<0 || grid[x][y]==0||v[x][y]) return false;
        return true;
    }



    public static boolean isSafe(int x,int y,int R , int C,int[][] grid,boolean[][] isVisited){

        if((x < R) && (x >= 0) && (y < C) && (y >= 0)  && (!isVisited[x][y]) && (grid[x][y] != 0)){
            return true ;
        }
        return false ;
    }


    /////////////////

    public boolean is_Possibles(int[][] grid)
    {
        int n=grid.length;
        int m= grid[0].length;
        boolean[][] v=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return isPath(grid,i,j,n,m,v);
                }
            }
        }
        return false;

    }












}
