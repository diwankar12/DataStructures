package Gfg.string;

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "ABBA";
        String str1 = "geeks";
        System.out.println(isPalindrome(str1));
    }

    public static boolean isPalindrome(String str){

         int ptr = str.length()-1;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(ptr)){
                ptr--;
            } else {
                return false ;
            }
        }

    return true ;


    }

}
