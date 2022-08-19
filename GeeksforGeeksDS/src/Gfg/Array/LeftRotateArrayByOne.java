package Gfg.Array;

import java.util.Arrays;

public class LeftRotateArrayByOne {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(leftRotateByOne(new int[]{1,2,3,4,5})));
    }


    //30,5,20,70,120

    //o/p 5,20,70,120,30

    //1,2,3,4,5
    //o/p 2,3,4,5,1
    public static int[] leftRotateByOne(int[] arr){

        int temp = arr[0] ;

        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp ;
       return arr ;

    }


}
