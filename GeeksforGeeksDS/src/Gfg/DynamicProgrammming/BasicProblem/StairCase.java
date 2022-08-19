package Gfg.DynamicProgrammming.BasicProblem;

public class StairCase {


    public static void main(String[] args) {
        int n = 10 ;
        int[] dp = new int[n + 1];
      System.out.println(countWays(n));
       System.out.println(countWaysMemo(n,dp));
        System.out.println(countTab(89));


    }



    static int countWaysMemo(int n,int[] dp){


        // your code here
        if (n < 0) {
             return 0;
        }

        // base case: there is one way to cover it with no steps
        if (n == 0) {
            return 1;
        }
       if(dp[n]==0) {
           dp[n] = countWays(n - 1) + countWays(n - 2);
           return dp[n];
       }
       return dp[n];
    }


   static int countWays(int n)
    {
        // your code here
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return countWays(n-1)+countWays(n-2);
    }


    static int countTab(int n){

        int[] f = new int[n+2] ;
        f[0] = 0;
        f[1] = 1 ;
        f[2] = 2 ;

        for(int i = 3 ;i<=n;i++){
            f[i] = (f[i-1] + f[i-2])%1000000007;
        }


        return f[n] ;


    }


}

