package Gfg.Array;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        System.out.println(missingNumber(new int[]{1,2,3,4,5},5));
        System.out.println(missingNumber(new int[]{28,7,-36,21,-21,-50,9,-32} ,8 ));

    }


    public static int missingNumber(int[] arr,int size){

        Arrays.sort(arr);
        if((size==1 ) && ((arr[0] > 1) || (arr[0]==0))){
            return 1;
        }


        // System.out.println(Arrays.toString(arr));
        int i ;
        for(i=0;i< size -1 ;i++){

            if((arr[i] >= 0) && (arr[i+1] - arr[i] > 1) ) {
                return arr[i] + 1;
            }

            if(arr[i]<0 && arr[i+1]>0 && arr[i+1] - arr[i] > Math.abs(arr[i])+1){
                return 1 ;
            }
        }
        if(i+1==size){
            return arr[size-1]+1 ;
        }

        return -1;

    }


}
