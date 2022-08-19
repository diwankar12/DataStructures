package algoExpert.Heap;

import java.util.*;

public class MergeSortedArrays {
    public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {
        // Write your code here.
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Tracker> pq = new PriorityQueue<Tracker>();
        int counter = 0;
        for(List<Integer> ls: arrays){
            pq.add(new Tracker(0,counter,ls.get(0)));
            counter++;
        }

        while(!pq.isEmpty()){

            Tracker removeItem = pq.remove();
            list.add(removeItem.data);
            if(removeItem.index == arrays.get(removeItem.rowId).size()- 1){
                continue;
            }

            pq.add(new Tracker(removeItem.index+1,removeItem.rowId,arrays.get(removeItem.rowId).get(removeItem.index+1))) ;
        }



        return list ;
    }


    static class Tracker implements Comparable<Tracker>{
        int index ;
        int rowId ;
        int data ;

        Tracker(int index,int rowId,int data){
            this.index = index ;
            this.rowId = rowId ;
            this.data = data ;
        }

        @Override
        public int compareTo(Tracker o) {
            return this.data - o.data ;
        }
    }




}

