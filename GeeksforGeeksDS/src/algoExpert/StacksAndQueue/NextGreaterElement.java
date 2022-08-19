package algoExpert.StacksAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2,5,-3,-4,6,7,2})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{0,0,5,0,0,3,0,0})));
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{7,6,5,4,3,2,1})));
    }

    public static int[] nextGreaterElement(int[] array) {
        // Write your code here.
        if(array.length==0){
            return new int[]{};
        }
        int size = array.length ;
        int[] res = new int[size];
        Stack<Integer> stack = new Stack<>();
        for(int i=size-1;i>=0;i--){
            stack.push(array[i]);
        }
        stack.push(array[size-1]) ;
        for(int i=size-1;i>=0;i--){
            if(stack.peek() > array[i]){
                res[i] = stack.peek() ;
            } else {
                while(stack.size() > 0 && stack.peek()<= array[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    res[i] = -1 ;
                } else {
                    res[i] = stack.peek();
                }
            }
            stack.push(array[i]) ;
        }

        return res;
    }




}
