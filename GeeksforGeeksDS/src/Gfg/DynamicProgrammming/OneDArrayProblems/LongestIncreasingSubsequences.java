package Gfg.DynamicProgrammming.OneDArrayProblems;

public class LongestIncreasingSubsequences {


    public static void main(String[] args) {

        int[] arr = new int[]{5,8,3,7,9,1};
        System.out.println(util(arr,0,-1));


    }





//    N = 6
//    A[] = {5,8,3,7,9,1}

    static int util(int arr[],int curr,int prev){

        if(curr==arr.length){
            return 0 ;
        }
        int include = 0 ;
        if(prev == -1 || arr[prev]<arr[curr]){
           include= 1 + util(arr,curr+1,curr);
        }
       int exclude = util(arr,curr+1,prev);

    return Math.max(include,exclude);

    }

    static int utilDp(int arr[],int curr,int prev,int[][] dp){

        if(dp[curr][prev]!=0){
            return dp[curr][prev] ;
        }

        if(curr==arr.length){
            return 0 ;
        }
        int include = 0 ;
        if(prev == -1 || arr[prev]<arr[curr]){
            include= 1 + util(arr,curr+1,curr);
        }
        int exclude = util(arr,curr+1,prev);

        return Math.max(include,exclude);

    }



}
