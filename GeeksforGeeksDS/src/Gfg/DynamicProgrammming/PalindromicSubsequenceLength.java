package Gfg.DynamicProgrammming;

public class PalindromicSubsequenceLength {

    public static void main(String[] args) {

    }



    // this is naive solution
    private static int getPalindromicLength(String s,int i,int j){

        //base case when i==j
        boolean b = s.charAt(i) == s.charAt(j);
        if(i+1==j && b){
            return 2;
        }

        if(i==j){
            return 1;
        }



        if(b){
            return 2+getPalindromicLength(s,i+1,j-1);
        } else {

            return Math.max(getPalindromicLength(s,i+1,j),getPalindromicLength(s,i,j-1));


        }





    }


}
