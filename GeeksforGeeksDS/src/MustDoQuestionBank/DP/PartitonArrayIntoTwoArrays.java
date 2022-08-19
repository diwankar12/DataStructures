package MustDoQuestionBank.DP;

import sun.jvm.hotspot.debugger.Page;

import java.util.HashMap;
import java.util.Map;

public class PartitonArrayIntoTwoArrays {

    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[]{3,9,7,3}));
    }

    public static int minimumDifference(int[] nums) {

        int totalSum =0 ;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i] ;
        }

        // boolean[][] dp = new boolean[nums.length][totalSum+1] ;
        Map<Pair,Boolean> dp = new HashMap<>();

        //base case
        for(int i=0;i<nums.length;i++){

            //   dp[i][0] = true ;
            dp.put(new Pair(i,0),true);
        }

        if(nums[0]<=totalSum){

            //dp[0][nums[0]] = true ;
            dp.put(new Pair(0,nums[0]),true);
        }

        for(int index =1;index<nums.length;index++){
            for(int target=1;target<=totalSum;target++){
                // recurrence relationship
                // boolean notTake = dp[index-1][target];
                Pair pair1 = new Pair(index-1,target);
                boolean notTake = false ;
                if(dp.containsKey(pair1)) {
                   notTake = dp.get(pair1);
                }
                boolean take = false ;

                if(target>=nums[index]){
                    //take = dp[index-1][target-nums[index]];
                    Pair pair2 = new Pair(index-1,target-nums[index]);
                    if(dp.containsKey(pair2)) {
                        take = dp.get(pair2);
                    }
                }
                boolean ans = notTake || take ;

                dp.put(new Pair(index,target),ans);
            }
        }

        dp.forEach((key,value)-> System.out.println("KEY ==" + key.getI()+" "+key.j + " value "+value));


        int min = Integer.MAX_VALUE ;

        for(int i=0;i<=totalSum;i++){
            Pair pair3 = new Pair(nums.length-1,i);
            if(dp.containsKey(pair3)){
                min = Math.min(min,Math.abs(i - (totalSum-i)));
            }
        }

        return min ;
    }

   static class Pair {
        int i ;
        int j ;


       Pair(int i, int j){
            this.i=i ;
            this.j=j ;
        }
       public int getI() {
           return i;
       }

       public void setI(int i) {
           this.i = i;
       }

       public int getJ() {
           return j;
       }

       public void setJ(int j) {
           this.j = j;
       }

   }

}
