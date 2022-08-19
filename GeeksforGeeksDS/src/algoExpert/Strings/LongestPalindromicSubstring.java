package algoExpert.Strings;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String str = "abaxyzzyxf";
        System.out.println(longestPalindromicSubstring(str));

    }

   public static  String longestPalindromicSubstring(String s){

        int start = 0 , end =0 ;
        for(int i=0;i<s.length();i++) {

            int len1 = expandFromCentre(s, i, i + 1);
            int len2 = expandFromCentre(s, i, i);
            int len = Math.max(len1, len2);
            if (start - end < len) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start,end+1);
   }


   static int expandFromCentre(String s , int i,int j){
        while(i>=0&& j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++ ;
        }
        return j-i-1;
   }



}
