package algoExpert.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RectangleMania {

    public static void main(String[] args) {
        List<Integer[]> ls = new ArrayList<>();
        Integer[] a1= new Integer[]{0,0};
        Integer[] a2= new Integer[]{0,1};
        Integer[] a3= new Integer[]{1,1};
        Integer[] a4= new Integer[]{1,0};
        Integer[] a5= new Integer[]{2,1};
        Integer[] a6= new Integer[]{2,0};
        Integer[] a7= new Integer[]{3,1};
        Integer[] a8= new Integer[]{3,0};
        ls.add(a1);
        ls.add(a2);
        ls.add(a3);
        ls.add(a4);
        ls.add(a5);
        ls.add(a6);
        ls.add(a7);
        ls.add(a8);
        System.out.println(rectangleMania(ls));


    }
    public static int rectangleMania(List<Integer[]> coords) {

        // construct 2d
        int[][] matrix = constructMatrix(coords);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " " );
            }
            System.out.println();
        }
        int row = matrix.length ;
        int col = matrix[0].length ;
        int ans = 0;
        boolean[][] visited = new boolean[row][col];
        boolean[][] recStack = new boolean[row][col] ;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(!visited[i][j]){
                    if(dfs(matrix,visited,recStack,i,j)){
                        ans++;
                    }
                }
            }
        }
        // update the count variable
        return ans;
    }

    public static boolean
    dfs(int[][] matrix,boolean[][] visited,boolean[][] recStack,int i,int j){

        visited[i][j] = true ;
        recStack[i][j] = true ;
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};

        for(int k=0;k<dx.length;k++) {
            int x = i + dx[k];
            int y = j + dy[k];
            if (isSafe(matrix, visited, recStack, x, y)) {
                if (dfs(matrix, visited, recStack, x, y)) {
                    return true;
                }else if (recStack[x][y]) {
                    return true;
               }
            }
        }

        recStack[i][j] = false ;
        return false ;
    }

    public static boolean isSafe(int[][] matrix,boolean[][] visited,boolean[][] recStack,int i,int j){
        if(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length && !visited[i][j]){
            return true ;
        }
        return false ;
    }

    public static int[][] constructMatrix(List<Integer[]> coords){
        int size = coords.size()/2;
        int[][] matrix = new int[size][size];
        for(Integer[] elem : coords){
            matrix[elem[0]][elem[1]] = 1 ;
        }
        return matrix ;
    }


}
