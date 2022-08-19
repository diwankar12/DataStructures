package algoExpert.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Competitions {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        list1.add("HTML");
        list1.add("C#");
        list2.add("C#");
        list2.add("Python");
        list3.add("Python");
        list3.add("HTML");
        competitions.add(list1);
        competitions.add(list2);
        competitions.add(list3);
        System.out.println(tournamentWinner(competitions,results));
//        {
//            "competitions": [
//    ["HTML", "C#"],
//    ["C#", "Python"],
//    ["Python", "HTML"]
//  ],
//            "results": [0, 0, 1]
//        }



    }
    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Map<String,Integer> mp = new HashMap<>();
        int index = 0;
        for(ArrayList<String> elem: competitions){
            if(results.get(index)==0){
                mp.put(elem.get(1),mp.getOrDefault(elem.get(1),3)+3);
            } else {
                 mp.put(elem.get(0),mp.getOrDefault(elem.get(0),3)+3) ;
            }
            index++;
        }
      int max = Integer.MIN_VALUE;
       String res = "";
      for(Map.Entry<String,Integer> mp1:mp.entrySet()){
          System.out.println("key ="+mp1.getKey()+" ,value="+mp1.getValue());
          if(mp1.getValue() > max){
              max = mp1.getValue();
              res = mp1.getKey();
          }
      }


        return res;
    }
}
