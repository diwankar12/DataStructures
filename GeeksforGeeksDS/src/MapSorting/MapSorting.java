package MapSorting;

import java.util.*;
import java.util.stream.Collectors;

public class MapSorting {


    public static void main(String[] args) {

        System.out.println(4%2);

        Map<String,Integer> mp = new HashMap<>();
        mp.put("Eight",8);
        mp.put("Three",3);
        mp.put("five",5);
        mp.put("Six",6);

// -----this is legacy one ----------------------------

        List<Map.Entry<String,Integer>> ls = new ArrayList<>(mp.entrySet());
        Collections.sort(ls, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        // alternate way for collections.sort
        Collections.sort(ls,(o1,o2)-> o1.getKey().compareTo(o2.getKey()));

        for(Map.Entry<String,Integer> entry : ls){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



        List<int[]> ls1 = new ArrayList<>();
        int[] position = {10,8,0,5,3}, speed = {2,4,1,1,3};
        for(int i=0;i<position.length;i++){
            ls1.add(new int[]{position[i],speed[i]});
        }

       Collections.sort(ls1, new Comparator<int[]>() {
           @Override
           public int compare(int[] o1, int[] o2) {
               return o2[0]-o1[0];
           }
       });

        for(int[] val:ls1){
            System.out.println(val[0]+"   "+val[1]);
        }
        //System.out.println(ls1.toString());

       // Collections max
        System.out.println("************************************");
        Map<Character,Integer> map = new HashMap<>();

        map.put('l',2);
        map.put('k',6);
        map.put('f',3);
        map.put('m',1);
        map.put('o',9);

        int num = Collections.max(map.values());
        System.out.println(num);


        System.out.println(Math.round(3.87));

    }



}


