package algoExpert.Strings;

import java.util.*;

public class GroupAnangrams {

    public static void main(String[] args) {
        String ia = "word" ;
        String[] strArray = new String[2];
        strArray[0] = "yup";
        strArray[1] = "no" ;
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(ia));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(strArray));
        System.out.println(list1.toString());
        System.out.println(list2.toString());


     groupAnagrams(Arrays.asList("yo","act","flop","tac","foo","cat","oy","olfp"));
    }

    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.

        Map<String,List<String>> mp = new HashMap<>();
        for(String word:words){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            if(mp.containsKey(sortedString)){
                mp.get(sortedString).add(word);
            }	else {
                mp.put(sortedString,new ArrayList<>(Arrays.asList(word)));
            }
        }
        return new ArrayList<>(mp.values());
    }
}
