package MustDoQuestionBank.DP;


//https://atcoder.jp/contests/dp/tasks/dp_b
public class FrogJump2 {

    public static void main(String[] args) {


    }


    public static int getfrogJump(int index,int[] heights,int K){

        if(index==heights.length-1){
            return 0;
        }

        int secondJump = Integer.MAX_VALUE;
        for(int i=1;i<=K;i++){

            if(index+i<heights.length){

                secondJump = Math.min(secondJump,getfrogJump(index+i,heights,K) + Math.abs(heights[index] - heights[index+2]));
            }
        }
        return secondJump ;

    }


}
