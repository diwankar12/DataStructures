package Gfg.string;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {


    public static void main(String[] args) {

    }


    public static String getMinWindowSubString(String s1,String s2){

        Map<Character,Integer> mp2 = new HashMap<>();
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
        }
        String ans = "";
        int mct = 0 ;
        int actualMatch = s2.length();

        Map<Character,Integer> mp1 = new HashMap<>();

       int i = -1;
       int j = -1 ;

        while(true){

            boolean f1 = false ;
            boolean f2 = false ;

         //acquire
         while((i < s1.length()-1) && (mct < actualMatch)){
             i++ ;
             char ch = s1.charAt(i);
             mp1.put(ch,mp1.getOrDefault(ch,0)+1);
             if(mp1.getOrDefault(ch,0)<=mp2.getOrDefault(ch,0)){
                 mct++;
             }
             f1= true ;
         }

         while(j<i && mct==actualMatch ){
            //collect answers
             String interAns = s1.substring(j+1,i+1);
             if(ans.length()==0 || interAns.length()<ans.length()){
                 ans=interAns ;
             }
           // release
             j++ ;
             char ch = s1.charAt(j);
             if(mp1.get(ch)==1){
                 mp1.remove(ch);
             } else {
                 mp1.put(ch,mp1.get(ch)-1);
             }
             if(mp1.getOrDefault(ch,0)<mp2.getOrDefault(ch,0)){
                 mct--;
             }
             f2=true ;
           }
            if(!f1 && !f2){
                break;
            }


        }
        return ans ;
    }

}
