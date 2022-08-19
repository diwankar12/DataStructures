package MustDoQuestionBank.DP;

import java.util.Arrays;
import java.util.Comparator;

public class FrogJump {


    public static void main(String[] args) {

        int[][] list = {{87,2},{0,8},{1,22} };

        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] l1, int[] l2) {
                return l1[0] - l2[0] ;
            }
        });

        System.out.println(Arrays.deepToString(list));

//        int[] array = {10,20,30,10};
//        frogJump(array.length,array);
    }

    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        int[] dp = new int[n];
        dp[0] = 0;

        for(int i=1;i<n;i++) {

            int firstJump = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int secondJump = Integer.MAX_VALUE;
            if (i > 1) {
                secondJump = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }

            dp[i] = Math.min(firstJump, secondJump);
        }

        return dp[n-1];
           // return getMemofrogJump(0,heights,dp) ;


    }

    public static int getMemofrogJump(int index,int[] heights,int[] dp){

        if(index==heights.length-1){
            return 0;
        }
        if(dp[index]!=0){
            return dp[index];
        }

        int secondJump = Integer.MAX_VALUE;
        //  if(index+1<heights.length){
        int firstJump   =  getMemofrogJump(index+1,heights,dp) + Math.abs(heights[index] - heights[index+1]);
        // }

        if(index+2<heights.length){

            secondJump = getMemofrogJump(index+2,heights,dp) + Math.abs(heights[index] - heights[index+2]);
        }


        dp[index] = Math.min(firstJump,secondJump);
        return dp[index] ;
    }




    public static int getfrogJump(int index,int[] heights){

        if(index==heights.length-1){
            return 0;
        }


        // int firstJump =Integer.MAX_VALUE;
        int secondJump = Integer.MAX_VALUE;
        //  if(index+1<heights.length){
        int firstJump   =  getfrogJump(index+1,heights) + Math.abs(heights[index] - heights[index+1]);
        // }

        if(index+2<heights.length){

            secondJump = getfrogJump(index+2,heights) + Math.abs(heights[index] - heights[index+2]);
        }
        return Math.min(firstJump,secondJump);

    }


}
