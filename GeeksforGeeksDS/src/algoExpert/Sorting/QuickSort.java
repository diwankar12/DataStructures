package algoExpert.Sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(quickSort(new int[]{23,1,44,5,78,90})));
        System.out.println(Arrays.toString(quickSort(new int[]{47,11,50,39,61,66,25,12,72,21})));
    }


    public static int[] quickSort(int[] array) {
        // Write your code here.
        quickSort(array,0,array.length-1);
        return array;
    }

    public static void quickSort(int[] array,int lowIndex,int highIndex){
        //base case
        if(lowIndex>=highIndex) return ;
        int pivotIndex = new Random().nextInt(highIndex-lowIndex) + lowIndex;
        // find pivot element
        int pivot = array[pivotIndex] ;
        swap(pivotIndex,highIndex,array);
        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        // recurse
        quickSort(array,lowIndex,leftPointer-1);
        quickSort(array,leftPointer+1,highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        // do the partition
        // a. declare pointers
        int leftPointer = lowIndex ;
        int rightPointer = highIndex ;
        // b. move the pointers with below conditions
        while(leftPointer<rightPointer){
            // we compare left pointer
            while(array[leftPointer] <=pivot && leftPointer<rightPointer ){
                leftPointer++;
            }
            while(array[rightPointer]>=pivot && leftPointer<rightPointer ){
                rightPointer--;
            }
            swap(leftPointer,rightPointer,array);
        }
        swap(leftPointer,highIndex,array);
        return leftPointer;
    }

    private static void swap(int i,int j,int[] array){
        int temp = array[i] ;
        array[i] = array[j];
        array[j] = temp ;
    }




}
