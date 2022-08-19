package algoExpert.Strings;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumChar {
    public static void main(String[] args) {

       // System.out.println(minimumCharactersForWords(new String[]{"your","you","or","yo"}));
        System.out.println(minimumCharactersForWords(new String[]{"this","that","did","deed","them!","a"}));
    }

    public static char[] minimumCharactersForWords(String[] words) {
        // Write your code here.
        Map<Character,Integer> res = new HashMap<>();
        for(String word : words){
            // create frquency map
            Map<Character,Integer> result = createFrquencyMap(word);
            updateMainFrequencyMap(result,res);
        }

      //  res.forEach((k,v)-> System.out.println(k + " value "+v));

        return buildResult(res);

    }

    private static char[] buildResult(Map<Character,Integer> res){
      int counter =0 ;
        int sum = 0;
        for (int f : res.values()) {
            sum += f;
        }

        char[] chars = new char[sum] ;
     for(Map.Entry<Character,Integer> entry : res.entrySet()){
         if(entry.getValue()==1){
             chars[counter] = entry.getKey();
             counter++;
         } else {
             int val = entry.getValue() ;
             while(val>0){
                 chars[counter] = entry.getKey();
                 val--;
                 counter++;
             }
         }

        }
    return chars ;

    }

    private static void updateMainFrequencyMap(Map<Character,Integer> singleWordMap,Map<Character,Integer> mainMap){

        if(mainMap.size()==0){
            mainMap.putAll(singleWordMap);
        } else {
            for(Map.Entry<Character,Integer> entry : singleWordMap.entrySet()){
                char ch = entry.getKey() ;
                if(mainMap.containsKey(ch)){
                    mainMap.put(ch,Math.max(entry.getValue(),mainMap.get(ch))) ;
                } else {
                    mainMap.put(ch,entry.getValue());
                }
            }
        }
    }


    private static Map<Character,Integer> createFrquencyMap(String word){
        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i) ;
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        return mp ;
    }
}
