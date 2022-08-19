package MustDoQuestionBank;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {

    public String minWindow(String s, String t) {


        // create count hashmap
        String ans = "";
        Map<Character, Integer> mpt = new HashMap<>();
        Map<Character, Integer> mps = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            mpt.put(ch, mpt.getOrDefault(ch, 0) + 1);
        }

        int i = 0;
        int j = 0;
        int totalCount = 0;
        int matchCount = t.length();

        while (true) {

            boolean f1= false ;
            boolean f2 = false ;

            while (i < s.length() && totalCount < matchCount) {
                char ch = s.charAt(i);
                mps.put(ch, mps.getOrDefault(ch, 0) + 1);
                if (mps.getOrDefault(ch,0) <= mpt.getOrDefault(ch,0)) totalCount++;
                i++;

                f1=true ;
            }

            while (j < i && totalCount == matchCount) {

                // collect
                String pans = s.substring(j,i+1);
                if(ans.length()==0 || pans.length() < ans.length()){
                    ans = pans ;
                }
               //release
                char ch = s.charAt(j);
                if(mps.get(ch)==1){
                    mps.remove(ch);
                } else {
                    mps.put(ch,mps.get(ch)-1);
                }

                if(mps.getOrDefault(ch,0)<mpt.getOrDefault(ch,0)){
                     totalCount--;
                }
                j++;
             f2=true ;
            }

            if(!f1 && !f2) break;

        }

   return ans ;
    }


}
