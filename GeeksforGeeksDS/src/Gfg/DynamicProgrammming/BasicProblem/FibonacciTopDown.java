package Gfg.DynamicProgrammming.BasicProblem;

public class FibonacciTopDown {

    public long findNthFibonacci(int number, long dp[])
    {
        // Your Code Here
        if(dp[number] != 0){
            return dp[number] ;
        }
        if(number==1){
            dp[1]=1;
        }
        if(number==0){
            dp[0]= 0;
        }

        dp[number] =  findNthFibonacci(number-1,dp)
                + findNthFibonacci(number-2,dp) ;
        return dp[number] ;

    }



}
