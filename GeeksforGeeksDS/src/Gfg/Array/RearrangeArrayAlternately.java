package Gfg.Array;

import java.util.Arrays;

public class RearrangeArrayAlternately {


    public static void main(String[] args) {
rearrange(new int[]{1,2,3,4,5,6},6);

//6 1 5 2 4 3
    }


    public static void rearrange(int arr[], int n){

        // Your code here

        if(n==1){
            return ;
        }




        int high = n-1;
        int low = 0 ;
        int[] tempArr = new int[n];
        int index =0 ;

        if(n%2!=0){
            int mid = 0 + (n-1 + 0 )/2 ;
            tempArr[n-1] = arr[mid] ;
        }
        while(high>low){

            tempArr[index] = arr[high] ;
            tempArr[index+1] = arr[low] ;
            low++;
            high-- ;
            index= index+2;
        }
        System.arraycopy(tempArr,0,arr,0,n);



    }
}
