package algoExpert.Strings;

import java.util.Stack;

public class LongestBalancedSubstring {

    public static void main(String[] args) {
        System.out.println(longestBalancedSubstring("())()(()())"));
    }



    public static int longestBalancedSubstring(String string) {
        // Write your code here.
        int ans = 0 ;
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<string.length();i++){
            if(string.charAt(i)=='('){
                stack.push(string.charAt(i));
            } else {
                int interAns = 0;
                while(!stack.isEmpty()){

                    if(string.charAt(i)==')'){
                        System.out.println("i "+i);
                        stack.pop();
                        interAns += 2;
                        ans=Math.max(interAns,ans);
                    }
                }
                System.out.println("Inter Ans "+interAns);
            }
        }

        return ans ;
    }
}
