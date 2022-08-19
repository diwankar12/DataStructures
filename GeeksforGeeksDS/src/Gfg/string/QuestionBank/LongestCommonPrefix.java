package Gfg.string.QuestionBank;

public class LongestCommonPrefix {


    public static void main(String[] args) {

        String[] strs = new String[]{"flower","flow","flight"};
        String[] strs1 = new String[]{"dog","racecar","car"} ;
        System.out.println(longestCommonPrefix(strs1));
        //["dog","racecar","car"]


    }

    public static String longestCommonPrefix(String[] strs) {

        String ans = "";
        int min = findMinLength(strs);

        char current ;
        for(int i=0;i<min;i++){

             current = strs[0].charAt(i);

            for(int j=1;j<strs.length;j++){

                if(strs[j].charAt(i)!=current){
                    return ans ;
                }

            }
            ans += current ;
        }



         return ans ;


    }

    private static int findMinLength(String[] strs) {

     int minLength = strs[0].length();

     for(int i=1;i<strs.length;i++){
         if(strs[i].length()<minLength){
             minLength = strs[i].length();
         }
     }

        return minLength;
    }

}
