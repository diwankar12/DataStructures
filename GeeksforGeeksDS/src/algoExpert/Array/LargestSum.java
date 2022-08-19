package algoExpert.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestRange(new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6})));
    }

    public static int[] largestRange(int[] array) {
        // Write your code here.
        //[1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6]
        //my output : [7, 5]
        //expected: [0,7]

        if(array.length==1) return new int[]{array[0],array[0]};

        Map<Integer,Boolean> map = new HashMap<>();
        int minIndex = 0;
        int maxIndex = 	0;

        for(int i=0;i<array.length;i++){
            map.put(array[i],false);
        }


        for(int i=0;i<array.length;i++){
            int leftSideVal = array[i]-1;
            int rightSideVal = array[i]+1 ;

            while(map.containsKey(leftSideVal) && !map.get(leftSideVal)){
                map.put(leftSideVal,true) ;
                leftSideVal--;

            }
            while(map.containsKey(rightSideVal) && !map.get(rightSideVal)){
                map.put(rightSideVal,true) ;
                rightSideVal++;
            }
            map.put(array[i],true);
            int newIndexLeft = leftSideVal +1;
            int newIndexRight = rightSideVal -1;
            if((newIndexRight-newIndexLeft) > (maxIndex-minIndex)) {
                maxIndex = newIndexRight;
                minIndex = newIndexLeft;
            }
        }

        return new int[] {minIndex,maxIndex};
    }



}
