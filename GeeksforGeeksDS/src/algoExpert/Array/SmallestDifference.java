package algoExpert.Array;

import java.util.Arrays;

public class SmallestDifference {

    public static void main(String[] args) {

        int[] arrayOne = {10,0,20,25,2200};
        int[] arrayTwo = {1005,1006,1014,1032,1031};
        System.out.println(Arrays.toString(smallestDifference(arrayOne,arrayTwo)));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int[] res = new int[2] ;

        int curr1 = 0 ;
        int curr2 = 0 ;
        int min = Integer.MAX_VALUE ;
        while(curr1<arrayOne.length && curr2< arrayTwo.length){
            if(arrayOne[curr1]<arrayTwo[curr2]){
                System.out.println("here");
                if(min>Math.abs(arrayOne[curr1] - arrayTwo[curr2])){
                    System.out.println("UP min "+min);
                    res[0] = arrayOne[curr1];
                    res[1] = arrayTwo[curr2] ;
                    min = Math.abs(arrayOne[curr1] - arrayTwo[curr2]) ;
                }
                curr1++;

            } else {
                if(min>Math.abs(arrayOne[curr1] - arrayTwo[curr2])){
                    System.out.println(min);
                    res[0] = arrayOne[curr1];
                    res[1] = arrayTwo[curr2] ;
                    min = Math.abs(arrayOne[curr1] - arrayTwo[curr2]);
                }
                curr2++ ;
            }

        }
        return res ;
    }
}
