package algoExpert.Strings;

import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutDuplication {

    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutDuplication("abcdabcef"));
    }


    public static String longestSubstringWithoutDuplication(String str) {
        if(str.length()==1){
            return str ;
        }
        Map<Character,Integer> mp = new HashMap<>();
        String longestString = "";
        String newString = "";
        int startIdx = 0 ;

        for(int currIdx= 0 ;currIdx<str.length();currIdx++){
            char ch = str.charAt(currIdx);
            if(!mp.containsKey(ch)) {
                mp.put(ch,currIdx) ;
            }else {
                int index = mp.get(ch) ;
                if(startIdx<=index){
                    newString = str.substring(startIdx,currIdx) ;
                    startIdx = index+1 ;
                }

                mp.put(ch,currIdx);
            }

            if(longestString.length() < newString.length()){
                longestString= newString;
            }
        }
        if(longestString.length()<str.substring(startIdx).length()){
              longestString = str.substring(startIdx) ;
        }
        if(longestString.length()==0){
            return str ;
        }
        return longestString;
    }
}
