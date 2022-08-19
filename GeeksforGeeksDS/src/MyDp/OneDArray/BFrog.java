package MyDp.OneDArray;

//https://atcoder.jp/contests/dp/tasks/dp_b
public class BFrog {

    public static void main(String[] args) {

        int[] arr = {10 ,30 ,40 ,50 ,20};
        int[] arr2 = {10,20,10};
        System.out.println(frogJump(arr2.length-1,arr2,1));
        System.out.println(frogJump(arr.length-1,arr,3));
        System.out.println(frogJump2(arr2,1));
        System.out.println(frogJump2(arr,3));
    }


    private static int  frogJump(int index,int[] arr,int k){

     if(index==0) return 0 ;
     int min = Integer.MAX_VALUE ;
     int jump = Integer.MAX_VALUE ;

     for(int j=1;j<=k;j++){
         if(index-j>=0) {
             jump = Math.abs(arr[index] - arr[index - j]) + frogJump(index - j, arr, k);
         } else break ;
         min = Math.min(jump,min);
     }
      return min ;


    }

    // top/down
    private static int  frogJump2(int[] arr,int k){
        int[] dp = new int[arr.length+1];
        dp[0] =  0 ;

        //int jump = Integer.MAX_VALUE ;


        for(int i=1;i<arr.length;i++){
            int min = Integer.MAX_VALUE ;
            for(int j=1;j<=k;j++){
                if(i-j>=0) {
                    int jump = Math.abs(arr[i] - arr[i - j]) + dp[i - j];
                    min = Math.min(jump,min);
                } else break ;

            }
             dp[i] = min ;
        }
       return dp[arr.length-1];
    }



}
