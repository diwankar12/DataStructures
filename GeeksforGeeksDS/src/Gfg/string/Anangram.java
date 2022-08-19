package Gfg.string;

import java.util.HashMap;
import java.util.Map;

public class Anangram {

    public static void main(String[] args) {
        System.out.println(isAnagram("abcdeabsd","sfasdfasf")) ;
    }

    public static boolean isAnagram(String a,String b)
    {

        // Your code here

        if(a.length() == 1 &&  b.length() == 1){
            return a.charAt(0) == b.charAt(0);
        }

        if(a.length() != b.length()){
            return false ;
        }

        Map<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<a.length();i++){

            if(mp.containsKey(a.charAt(i))){
                mp.put(a.charAt(i),mp.get(a.charAt(i))+1);
            } else {
                mp.put(a.charAt(i),1);
            }

            System.out.println("key ,"+i+"Value"+mp.get(i));
        }

        mp.forEach((k,v) -> System.out.println("Key = "
                + k + ", Value = " + v));

        for(int j=0;j<b.length();j++){

            if(mp.containsKey(b.charAt(j))){
                mp.put(b.charAt(j),mp.get(b.charAt(j))-1);
            }
        }

        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if(entry.getValue() !=0){
                return false ;
            }

        }
        return true ;

    }
}
