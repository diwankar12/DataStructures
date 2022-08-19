package algoExpert.Searching;

import java.util.Arrays;

public class SearchInSortedMatrix {


    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                                     {1,4,7,12,15,1000},
                                     {2,5,19,31,32,1001},
                                     {3,8,24,33,35,1002},
                                     {40,41,42,44,45,1003},
                                     {99,100,103,106,128,1004}
                                 };

        System.out.println(Arrays.toString(searchInSortedMatrix(matrix,33)));


    }

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        // Write your code here.

        int row = 0;
        int col = matrix[0].length-1;

        while(row <= matrix.length-1 && col>=0){

            if(matrix[row][col]==target){
                return new int[]{row,col};
            } else if (matrix[row][col]>target){
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}




