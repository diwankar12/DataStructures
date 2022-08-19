package Gfg.Array;

import java.util.Arrays;
import java.util.Map;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10,5,7,30};
        System.out.println(Arrays.toString(reverseAnArray(arr)));

    }


    public static int[] reverseAnArray(int[] arr){

        // 10,5,7,30
        // o/p : 30,7,5,10
        int start = 0;
        int end = arr.length-1;

        while(start<end){

            int temp = arr[start];
           arr[start] = arr[end] ;
           arr[end] = temp ;

           start++;
           end--;
        }

      return arr;
    }


}
