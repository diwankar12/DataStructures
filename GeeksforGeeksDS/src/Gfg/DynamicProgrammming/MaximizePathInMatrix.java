package Gfg.DynamicProgrammming;

public class MaximizePathInMatrix {

    private static int ans1 = Integer.MIN_VALUE ;
   private static  int ans2 = Integer.MIN_VALUE ;
   private static int R =3;
    private static int C =3;
   private static int[][] dp = new int[R][C];

    public static void main(String[] args) {

       // int matrix[][]= {{1, 2, 3},
                   //      {4, 5, 6}};


        int matrix[][]=    {{1, 2, 3},
                           {4, 8, 2},
                            {1, 5, 3}};
        System.out.println(getMaxNaive(3,3,0,0,matrix));
        System.out.println(maximizeTab(matrix,R,C));


    }

    public static int maximizeTab(int[][] matrix,int R,int C){

    // create prefix sum for first row
      for(int i=1;i<C;i++) {
          matrix[0][i] = matrix[0][i] + matrix[0][i - 1];
      }
    // create prefix sum for first column
        for(int i=1;i<R;i++){
            matrix[i][0] = matrix[i][0] + matrix[i-1][0] ;
        }

        // create tabulation method
     for(int i=1;i<R;i++){
         for(int j=1;j<C;j++){
           matrix[i][j]= matrix[i][j] +  Math.max(matrix[i-1][j],matrix[i][j-1]) ;
         }
     }
      return matrix[R-1][C-1];
    }



    private static int getMaxNaive(int R,int C ,int i,int j,int[][] matrix){



        if(i==R-1 && j==C-1){
            return matrix[i][j] ;
        }
        if(i==R-1){
          return  matrix[i][j] + getMaxNaive(R,C,i,j+1,matrix);

        }
        else if(j==C-1){
           return  matrix[i][j] + getMaxNaive(R,C,i+1,j,matrix);

        } else {

            return Math.max(matrix[i][j] + getMaxNaive(R,C,i,j+1,matrix),
                    matrix[i][j] + getMaxNaive(R,C,i+1,j,matrix)) ;

        }
    }


    // solve for dp "memoization"
}
