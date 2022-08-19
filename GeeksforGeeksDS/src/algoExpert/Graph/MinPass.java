package algoExpert.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinPass {


    public static void main(String[] args) {
        int[][] matrix = {
                {0, -1, -3, 2, 0},
                {1, -2, -5, -1, -3},
                {3, 0, 0, -4, -1}
              };
        System.out.println(minimumPassesOfMatrix(matrix));

    }

    public static int minimumPassesOfMatrix(int[][] matrix) {
        int minPasses = 0 ;
        Queue<int[]> queue = getPositiveNumbers(matrix);

        while(queue.size()>0){
            int currentSize = queue.size();
            while(currentSize>0){
                int[] number = queue.poll();
                markPositive(number,matrix,queue);
                currentSize--;
            }
            minPasses++;
        }

        return (checkNegativeNumber(matrix)) ?  -1 :minPasses-1  ;
    }

    public static boolean checkNegativeNumber(int[][] matrix){

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    return true ;
                }
            }
        }
        return false ;
    }


    public static void markPositive(int[] number,int[][] matrix,Queue<int[]> queue){
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        int i = number[0];
        int j = number[1] ;

        for(int k=0;k<dx.length;k++){
            int x = i+dx[k] ;
            int y = j+dy[k] ;

            if(x>=0 && x<matrix.length && y>=0 && y<matrix[0].length && (matrix[x][y]<0)){
                matrix[x][y]  *= (-1) ;
                queue.add(new int[]{x,y});
            }
        }
    }

    public static Queue<int[]> getPositiveNumbers(int[][] matrix){
        Queue<int[]> positiveNumbers = new LinkedList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>0){
                    positiveNumbers.add(new int[]{i,j});
                }
            }
        }
        return positiveNumbers ;
    }
}

