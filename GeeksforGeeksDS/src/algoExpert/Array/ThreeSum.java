package algoExpert.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<Integer[]> threeNumberSumStriver(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> list = new ArrayList<>();

        // 12,3,1,2,-6,5,-8,6
        Arrays.sort(array);
        for(int i=0;i<array.length-2;i++) {

            //case 1 :
            if (i == 0 || (i > 0 && array[i] != array[i - 1])) {
                int a = -array[i] + targetSum;
                int high = array.length - 1;
                int low = i+1;
                while (low < high) {
                    if (array[high] + array[low] == a) {

                        list.add(new Integer[]{-a, array[low], array[high]});
                        while(low<high && array[low]==array[low+1]) low++;
                        while(low<high && array[high]==array[high-1]) high--;
                        high--;
                        low++;

                    } else if (array[high] + array[low] > a) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }


        return list;
    }
}
