package algoExpert.Strings;

import java.util.*;

public class ReverseWords {

    public static void main(String[] args) {
     String name = "Time is great" ;
        System.out.println(reverseWordsInString(name));
        System.out.println(Math.max(1,1));
        char[] chars ;
    }

    public static String reverseWordsInString(String string) {
        // Write your code here.
        int startCounter = 0;
        ArrayList<String> stack = new ArrayList<>();
        for(int i=0;i<string.length();i++){

         if (string.charAt(i) ==' '){
              stack.add(string.substring(startCounter,i));
              startCounter=i;
          } else if (string.charAt(startCounter)==' '){
              stack.add(" ");
             startCounter=i;
         }


        }
        stack.add(string.substring(startCounter));
        System.out.println(stack.toString());
        Collections.reverse(stack);

        return String.join("",stack);
    }



}
