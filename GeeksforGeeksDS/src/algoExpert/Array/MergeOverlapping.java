package algoExpert.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MergeOverlapping {


    public static void main(String[] args) {
//        int[][] array = new int[][]{{1, 2},
//                {3, 5},
//                {4, 7},
//                {6, 8},
//                {9, 10}} ;
//        int[][] sortedIntervals = array.clone();
//        Arrays.sort(array,(a,b)-> Integer.compare(a[0],b[0]));
//
//        System.out.println(Arrays.toString(mergeOverlappingIntervals(array)));
//        List<int[]> ls = new ArrayList<>();

        int[][] array1 = new int[][]{{2, 3},
                {4, 5},
                {6, 7},
                {8, 9},
                {1, 10}};

        Arrays.sort(array1, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(array1));


        Stack<Integer> stack = new Stack<>();

    }

    public int[][] mergeOverlappingIntervals(int[][] intervals) {
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = sortedIntervals[0];
        mergedIntervals.add(currentInterval);
        int counter = 0;
        for (int i = 1; i < sortedIntervals.length; i++) {

            if (mergedIntervals.get(counter)[1] >= sortedIntervals[i][0]) {
                int[] res = mergedIntervals.get(counter);
                res[1] = Math.max(sortedIntervals[i][1], mergedIntervals.get(counter)[1]);

            } else {
                mergedIntervals.add(sortedIntervals[i]);
                counter++;
            }

        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
