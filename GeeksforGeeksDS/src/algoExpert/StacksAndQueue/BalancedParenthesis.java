package algoExpert.StacksAndQueue;

import java.util.*;

public class BalancedParenthesis {

    public static void main(String[] args) {
       // System.out.println(balancedBrackets("([])(){}(())()()") );
        System.out.println(balancedBrackets("(141[])(){waga}((51afaw))()hh()"));
        int[] ans1 = {1,2};
        int[] ans2 = {3,4};
        ArrayList<int[]> queue = new ArrayList<>();
        queue.add(ans1);
        queue.add(ans2);
        int[] ints = queue.remove(queue.size() - 1);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }


    public static boolean balancedBrackets(String str) {
        // Write your code here.
        Stack<Character> stack = new Stack<>();
        String closingBrackets = ")]}";
        //"([])(){}(())()()"
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                stack.push(str.charAt(i));
            }
            else if(closingBrackets.indexOf(str.charAt(i))!=-1){
                if(stack.isEmpty()){
                    return false ;
                } else {
                    if(match(stack.peek(),str.charAt(i))) {
                        stack.pop();
                    } else {
                        return false ;
                    }
                }
            }
        }
      return stack.isEmpty();
    }


    public static boolean match(char ch1,char ch2){

        if((ch1=='(' && ch2==')') || (ch1=='[' && ch2==']') || (ch1=='{' && ch2=='}') ){
            return true ;
        }
        return false ;
    }




}
