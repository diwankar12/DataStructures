package Gfg.DynamicProgrammming;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

    }


    private int getLis(int[] lis){

        int[] resultArray = new int[lis.length];

        resultArray[0] =1 ;
        for(int i=1;i<lis.length;i++){
            resultArray[i] = 1 ;
            for(int j=0;j<i;j++){
                if(lis[i]>lis[j]){
                    resultArray[i] = Math.max(resultArray[i],resultArray[j]+1);
                }
            }
        }

        int res = resultArray[0] ;

        for(int i=0;i<resultArray.length;i++){

            res = Math.max(res,resultArray[i]);
        }

return res ;

    }


    private void getLisBruteForce(int[] lis){













    }


}
