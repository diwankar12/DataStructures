package Gfg.string;

public class CheckSusequence {

    public static void main(String[] args) {

//        A = gksrek
//        B = geeksforgeeks



    }


    public static boolean checkSub(String a , String b){

        int sizeOfa = a.length();
        int sizeOfb = b.length() ;
        int ptr1,ptr2  ;
        for( ptr1=0,ptr2 = 0 ;ptr1<sizeOfa && ptr2<sizeOfb; ptr2++){
            if(a.charAt(ptr1)==b.charAt(ptr2)){
                ptr1++;
            }
        }

       if(ptr1==sizeOfa) {
           return true;
       }
        return false ;
    }



}
