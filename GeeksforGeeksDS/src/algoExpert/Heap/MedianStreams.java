package algoExpert.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianStreams {

    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) {

        System.out.println(insert(5));
        System.out.println(insert(10));

    }


    public static int  insert(int number){



   if(minHeap.isEmpty() && maxHeap.isEmpty()){
        maxHeap.add(number);
        return maxHeap.peek() ;
   }

   if(maxHeap.peek() > number){
       maxHeap.add(number);
   } else {
       minHeap.add(number) ;
   }

   if(maxHeap.size() - minHeap.size() > 1 ){
       minHeap.add(maxHeap.remove());
   } else if (minHeap.size() - maxHeap.size() > 1){
          maxHeap.add(minHeap.remove());
   }


     if (maxHeap.size()==minHeap.size()){
        return ((maxHeap.peek()+minHeap.peek())/2);
    } else {
         if(maxHeap.size() > minHeap.size()) {
             return maxHeap.peek();
         } else {
             minHeap.peek();
         }
     }
     return -1 ;

    }




}
