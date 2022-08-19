package Gfg.Array;

import java.util.Arrays;

public class EquilibriumPoint {


    public static void main(String[] args) {
        System.out.println(getEquilibriumPoint(new int[]{3,4,8,-9,20,6}));
        System.out.println(getEquilibriumPoint(new int[]{4,-2,2}));
        System.out.println(getEquilibriumPoint(new int[]{-2,2,4}));
    }

    // not good solution
    public static int getEquilibriumPoint(int[] arr){

   // 3,4,8,-9,20,6
 // 32,29,25,17,26,6

        // 4,-2,2
        // 4,0,2

        // -2,2,4
        //  4,6,4
        // generate prefix sum

        int[] prefix_sum_backWard = new int[arr.length];

        prefix_sum_backWard[arr.length-1] = arr[arr.length-1] ;
        for(int i=arr.length-2;i>=0;i--){
            prefix_sum_backWard[i] = prefix_sum_backWard[i+1] + arr[i] ;
        }

        System.out.println(Arrays.toString(prefix_sum_backWard));

      if(prefix_sum_backWard[1]==0){
          return 0 ;
      }

        if(Math.abs(prefix_sum_backWard[prefix_sum_backWard.length-1]-prefix_sum_backWard[0])==0){
            return  prefix_sum_backWard.length-1 ;
        }

        for(int i=1;i<prefix_sum_backWard.length-1;i++){

            if(Math.abs(prefix_sum_backWard[i]-prefix_sum_backWard[0])==prefix_sum_backWard[i+1]){
              //  System.out.println("i" + i);
                return i ;
            }



        }
       return -1 ;

    }

     // good logic
      public static boolean proEquilibrium(int arr[],int n){

          // 3,4,8,-9,20,6

      int sum =0 ;

      for(int i=0;i<n;i++){
          sum += arr[i] ;
      }

      int left_sum = 0 ;
      for(int i=0;i<n;i++){
          if(left_sum==sum-arr[i]){
              return true ;
          }
          left_sum = left_sum + arr[i];
          sum = sum - arr[i] ;
      }
        return  false ;
 }
}
