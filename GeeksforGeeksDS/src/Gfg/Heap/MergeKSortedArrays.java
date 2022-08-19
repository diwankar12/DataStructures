package Gfg.Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArrays {

    public static void main(String[] args) {


    }


    public static List<Integer> getMergeSortedArrays(ArrayList<ArrayList<Integer>> matrix){

        PriorityQueue<Triplet> priorityQueue = new PriorityQueue<>();
        List<Integer> resultList = new ArrayList<>();

        for(int i=0;i<matrix.size();i++){
            priorityQueue.add(new Triplet(matrix.get(i).get(0),i,0));
        }

        while(!priorityQueue.isEmpty()){

            Triplet curr = priorityQueue.poll();
            resultList.add(curr.value);
            int arrayPositionCurrent = curr.arrayPosition;
            int arrayValuePositionCurrent = curr.valuePosition ;

            if(arrayValuePositionCurrent +1 < matrix.get(arrayPositionCurrent).size()){

                priorityQueue.add(new Triplet(matrix.get(arrayPositionCurrent).get(arrayValuePositionCurrent+1),arrayPositionCurrent,arrayValuePositionCurrent+1));
            }
        }
     return resultList ;
    }
}



class Triplet implements Comparable<Triplet>{

    public int value ;
    public int arrayPosition ;
    public int valuePosition ;

    Triplet(int value ,int arrayPosition,int valuePosition){

        this.value=value ;
        this.arrayPosition=arrayPosition ;
        this.valuePosition=valuePosition ;
    }


    @Override
    public int compareTo(Triplet t) {
        if(value <= t.value){
            return 0;
        } else
        {
            return 1 ;
        }
    }
}