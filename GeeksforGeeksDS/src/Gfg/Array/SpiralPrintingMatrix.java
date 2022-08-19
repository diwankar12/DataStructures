package Gfg.Array;

public class SpiralPrintingMatrix {



//    Input:  1    2   3   4
//            5    6   7   8 (1,3)
//            9   10  11  12
//            13  14  15  16
//    Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

    public static void main(String[] args) {

    }


    private static void printSpiral(int[][] matrix,int R,int C){

       // (0,0) -> (0,C) -> (R,C) -> (R,0) ->()

        for(int i=0;i<=R;i++){
            int j ;
            for( j=0;j<=C;j++){
                System.out.println(matrix[i][j]);
            }

        }





    }


}
