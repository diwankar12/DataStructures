package algoExpert.Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextSmallestElements {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(getNextSmallestLeftSide(new int[]{2,1,5,6,2,3})));
        System.out.println(Arrays.toString(getNextSmallestRightSide(new int[]{2,1,5,6,2,3})));
    }


    public int largestRectangleUnderSkyline(ArrayList<Integer> heights) {
        // Write your code here.
        int n = heights.size();
        Stack<Integer> st = new Stack<>();
        int leftSmall[] = new int[n];
        int rightSmall[] = new int[n];
        for(int i = 0;i<n;i++) {
            while(!st.isEmpty() && heights.get(st.peek()) >= heights.get(i)) {
                st.pop();
            }

            if(st.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = st.peek() + 1;
            st.push(i);
        }
        while(!st.isEmpty()) st.pop();

        for(int i = n-1;i>=0;i--) {
            while(!st.isEmpty() &&  heights.get(st.peek()) >= heights.get(i)) {
                st.pop();
            }

            if(st.isEmpty()) rightSmall[i] = n-1;
            else rightSmall[i] = st.peek() - 1;

            st.push(i);
        }
        int maxA = 0;
        for(int i = 0;i<n;i++) {
            maxA = Math.max(maxA, heights.get(i) * (rightSmall[i] - leftSmall[i] + 1));
        }
        return maxA;


    }




    public static int largestRectangleUnderSkyline(int[] heights) {
        // Write your code here.


        int[] leftSideSmallest = getNextSmallestLeftSide(heights);
        int[] rightSideSmallest = getNextSmallestRightSide(heights);


        // get the smallest element on the right side
        // multiply with the
        int counter = 0;
        int maxArea = Integer.MIN_VALUE ;
        while(counter <heights.length){
            int area  = heights[counter] * Math.abs((rightSideSmallest[counter] - leftSideSmallest[counter] +1));
            if(maxArea < area){
                maxArea = area ;
            }
        }

        return maxArea ;
    }
    private static int[] getNextSmallestLeftSide(int[] array){

        int[] res = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        res[0] =0;

        for(int i=1;i<array.length;i++){

            while(!stack.isEmpty() && array[i]<=array[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i] = 0;
            } else {
                res[i] = stack.peek()+1 ;

            }

            stack.push(i) ;

        }

        return res ;
    }

    private static int[] getNextSmallestRightSide(int[] array) {
        int[] res = new int[array.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(array.length-1);
        res[array.length-1] = array.length-1;

        for (int i = array.length-2; i >=0; i--) {

            while (!stack.isEmpty() && array[i] < array[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = array.length-1;
            } else {
                res[i] = stack.peek() -1;

            }

            stack.push(i);

        }

        return res;
    }


}
