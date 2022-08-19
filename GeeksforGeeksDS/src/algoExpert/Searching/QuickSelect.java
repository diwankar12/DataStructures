package algoExpert.Searching;


import java.util.Arrays;

public class QuickSelect {

    public static void main(String[] args) {

        System.out.println(quickselect(new int[]{8, 5, 2, 9, 7, 6, 3},3));
    }
    public static int quickselect(int[] array, int k) {
        // Write your code here.
        int counter = k;
        while(counter>0){

            partition(array,0,array.length-1);
            System.out.println(Arrays.toString(array));
            counter--;
        }
        return array[k-1];
    }

    private static void partition(int[] array,int lowIndex,int highIndex){


        int pivot = array[highIndex] ;
        int leftPointer = lowIndex ;
        int rightPointer = highIndex ;

        while(leftPointer<rightPointer){
            while(array[leftPointer]<=pivot && leftPointer<rightPointer){
                leftPointer++;
            }
            while(array[rightPointer]>=pivot && leftPointer<rightPointer){
                rightPointer--;
            }
            swap(leftPointer,rightPointer,array);
        }

        swap(leftPointer,highIndex,array);

    }

    private static void swap(int i,int j,int[] array){
        int temp = array[i] ;
        array[i] = array[j];
        array[j] = temp ;
    }




}
