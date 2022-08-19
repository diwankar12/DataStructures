package algoExpert.StacksAndQueue;

import java.util.ArrayList;
import java.util.List;

public class MinMaxStack {

    public static void main(String[] args) {
        MinMaxStack minMaxStack = new MinMaxStack();
        minMaxStack.push(2);
        minMaxStack.getMin();
        minMaxStack.getMax();
        System.out.println(stackMin.toString());
        System.out.println(stackMax.toString());

        System.out.println("===========================");
        minMaxStack.peek();
        minMaxStack.push(7);
        minMaxStack.getMin();
        minMaxStack.getMax();
        minMaxStack.peek();
        minMaxStack.push(2);
        minMaxStack.getMin();
        minMaxStack.getMax();
        minMaxStack.peek();
        System.out.println(stackMin.toString());
        System.out.println(stackMax.toString());
        System.out.println("======");
        minMaxStack.pop();
        minMaxStack.pop();
        System.out.println(stackMin.toString());
        System.out.println(stackMax.toString());
        minMaxStack.getMin();
        minMaxStack.getMax();
        minMaxStack.peek();


    }



        static List<Integer> stack = new ArrayList<>();
        static List<Integer> stackMin = new ArrayList<>();
        static List<Integer> stackMax = new ArrayList<>();

        public int peek() {
            // Write your code here.
            if(stack.isEmpty()){
                return -1 ;
            }
            return stack.get(stack.size()-1);
        }


        public int pop() {
            // Write your code here.
            if(stack.isEmpty()){
                return -1 ;
            }
            if(stackMin.isEmpty()){
                return -1 ;
            } else {
                stackMin.remove(stackMin.size()-1);
            }
            if(stackMax.isEmpty()){
                return -1 ;
            } else {
                stackMax.remove(stackMax.size()-1);
            }
            return stack.remove(stack.size()-1);
        }

        public void push(Integer number) {
            // Write your code here.
            int len = stackMin.size()-1 ;

            if(stackMin.size()==0){
                stackMin.add(number);
            }
            else if(stackMin.get(len)>number){
                stackMin.add(number);
            } else {
                stackMin.add(stackMin.get(len));
            }

            if(stackMax.size()==0){
                stackMax.add(number);
            }
            else if(stackMax.get(len)<number){
                stackMax.add(number);
            } else {
                stackMax.add(stackMax.get(len));
            }
             stack.add(number);
        }

        public int getMin() {
            // Write your code here.
            if(stackMin.isEmpty()){
                return -1 ;
            }
            return stackMin.get(stackMin.size()-1);

        }

        public int getMax() {
            // Write your code here.
            if(stackMax.isEmpty()){
                return -1 ;
            }
            return stackMax.get(stackMax.size()-1);
        }




}
