package MustDoQuestionBank;

import java.util.Arrays;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
    public static String longestPalindrome(String s) {

        int[] max = new int[2] ;

        for(int i=1;i<s.length();i++){

            int[] odd = getLongest(i-1,i+1,s);
            System.out.println("ODD "+Arrays.toString(odd));
            int[] even = getLongest(i-1,i,s);
            System.out.println("EVEN "+Arrays.toString(even));
            max[0] = Math.max(Math.abs(odd[1]-odd[0]),max[0]);
            max[1] = Math.max(Math.abs(even[1]-even[0]),max[1]);

        }

        return s.substring(max[0],max[1]+1);


    }

    public static int[] getLongest(int i,int j,String s){

        while(i>=0 && j <s.length()){
            if(s.charAt(i)!=s.charAt(j)) break ;
            i--;
            j++;
        }

        return new int[]{i+1,j-1};


    }

}
