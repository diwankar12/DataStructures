package algoExpert.Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonREpeating {

    public int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        Map<Character,Values> mp = new LinkedHashMap<>();

        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            if(mp.containsKey(ch)){
                mp.put(ch,new Values(i,mp.get(ch).frequency+1));
            } else {
                mp.put(ch,new Values(i,1));
            }


        }
      for(Map.Entry<Character,Values> entry: mp.entrySet()){
          if(entry.getValue().frequency==1){
              return entry.getValue().index;
          }
      }


        return -1;
    }

    class Values {

        int index ;
        int frequency ;

        Values(int index,int frequency){
            this.index=index;
            this.frequency=frequency ;
        }

    }
}
