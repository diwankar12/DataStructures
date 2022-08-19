package Gfg.Hashing;

import java.util.*;

public class SortingElementByFrequency {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 6, 2, 3, 1, 4, 1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};
        int n= 20 ;
        System.out.println(sortByFreq(arr,n));
    }

    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        // add your code here
        Map<Integer, Integer> mp = new TreeMap<>();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entryMap = mp.entrySet();
        List<Map.Entry<Integer, Integer>> listMap = new ArrayList<>(entryMap);
        Collections.sort(listMap, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
               return o2.getValue().compareTo(o1.getValue());
            }
        });

        listMap.forEach(e->{
            //System.out.println(e.getKey()+",value"+e.getValue());
            if(e.getValue()>1) {
                int limit = e.getValue();
                for (int i = 0; i < limit; i++) {
                    list.add(e.getKey());
                }
            }
        });
//        listMap.forEach(e->{
//            System.out.println(e.getKey()+",value"+e.getValue());
//        });
//        list.stream().forEach(elem -> System.out.println("element " + elem));
//        listMap.forEach(e->{
//            System.out.println(e.getKey()+",value"+e.getValue());
//        });

//        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//            if (entry.getValue() > 1) {
//                int limit = entry.getValue();
//                for (int i = 0; i < limit; i++) {
//                    list.add(entry.getKey());
//                }
//            }
//
//        }

        listMap.forEach(e->{
            if (e.getValue() == 1) {
                list.add(e.getKey());
            }
        });

//
//        for (Map.Entry<Integer, Integer> entry : listMap.()) {
//            if (entry.getValue() == 1) {
//                list.add(entry.getKey());
//            }
//
//        }


        return list;

    }
}