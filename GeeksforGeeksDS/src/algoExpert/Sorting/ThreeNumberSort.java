package algoExpert.Sorting;

import java.util.Arrays;

public class ThreeNumberSort {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(threeNumberSort(new int[]{1,0,0,-1,-1,0,1,1},new int[]{0,1,-1})));

    }

    public static int[] threeNumberSort(int[] array, int[] order) {
        // Write your code here.
        // using two loops
        int firstElem = order[0] ;
        int counter =0 ;
        for(int i=0;i<array.length;i++) {
            if (array[i] == firstElem) {
                swap(counter, i, array);
                counter++;
            }
        }


        int secondElem = order[1];
        for(int i=counter;i<array.length;i++){
            if(secondElem==array[i]){
                swap(counter,i,array);
                counter++;
            }

        }
        return array;
    }

    private static void swap(int i,int j,int[] array){
        int temp = array[i] ;
        array[i] = array[j] ;
        array[j] = temp ;
    }
}
