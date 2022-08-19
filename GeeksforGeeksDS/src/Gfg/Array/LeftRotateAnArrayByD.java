package Gfg.Array;

import java.util.Arrays;

public class LeftRotateAnArrayByD {


    public static void main(String[] args) {


        System.out.println(Arrays.toString(leftRotate(new int[]{10,5,30,15},3)));
        System.out.println(Arrays.toString(leftRotate(new int[]{1,2,3,4,5},2)));
    }



    //1,2,3,4,5      d=2
    // o/p : 3,4,5,1,2

    //10,5,30,15   d=3
    //15,10,5,30

    public static int[] leftRotate(int[] arr, int d){


        int[] tempArray=  Arrays.copyOf(arr,d);
       // System.out.println(Arrays.toString(tempArray));
        int i  ;
        for( i=0;i<arr.length-d;i++){
            arr[i] = arr[i+d];
        }
       // System.out.println(Arrays.toString(arr));
        System.arraycopy(tempArray,0,arr,i,d);

        return arr;

    }


}
