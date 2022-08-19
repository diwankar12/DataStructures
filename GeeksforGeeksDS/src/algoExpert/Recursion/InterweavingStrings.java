package algoExpert.Recursion;

public class InterweavingStrings {


    public static void main(String[] args) {
        String one = "a" ;
        String two = "b" ;
        String three = "ab";
        System.out.println(interweavingStrings(one,two,three));
    }


    public static boolean interweavingStrings(String one, String two, String three) {
        // Write your code here.
        // using recursion two pointers
        if(three.length() != one.length()+two.length()) return false ;
        return interweavingStringsRec(one,two,three,0,0,0);

    }

    public static boolean interweavingStringsRec(String one, String two, String three,int i,int j,int k){

        if(k==three.length()){
            return true ;
        }
        if(i<one.length() && one.charAt(i)==three.charAt(k)){
            if(interweavingStringsRec(one,two,three,i+1,j,k+1)) return true ;
        }
        if (j<two.length() && two.charAt(j)==three.charAt(k)){
            if(interweavingStringsRec(one,two,three,i,j+1,k+1)) return true ;
        }
        return false ;
    }
}
