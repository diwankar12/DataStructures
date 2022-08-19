package Gfg.Heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianStream {


    public static void main(String[] args) {

        getMedian(new double[]{5,15,1,3});
        System.out.println("===========");
        getMedian(new double[]{5,10,15});

    }


    public static void getMedian(double arr[]){

        // add your code here
        // create max and min heap
        PriorityQueue<Double> minHeap = new PriorityQueue<>();
        PriorityQueue<Double> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // add a element
        maxHeap.add(arr[0]) ;
        System.out.println(arr[0]) ;

        for(int i =1;i<arr.length;i++){

            // check if the number is greater than maxHeap then put in minHeap
            double curr = arr[i] ;
            if(curr < maxHeap.peek()){
                maxHeap.add(curr);
            } else {
                minHeap.add(curr) ;
            }

            //balancing
            if(maxHeap.size() - minHeap.size() > 1){
                minHeap.add(maxHeap.peek());
                maxHeap.poll() ;
            } else if(minHeap.size() - maxHeap.size() > 1) {
                maxHeap.add(minHeap.peek());
                minHeap.poll() ;
            }

            // print out the median
//            for(Integer pq1:maxHeap){
//                System.out.println("=====maxHeap==="+pq1);
//            }
//
//            for(Integer pq2:minHeap){
//                System.out.println("======minHeap===="+pq2);
//            }

            if(maxHeap.size()==minHeap.size()){
                System.out.println((maxHeap.peek() + minHeap.peek())/2) ;
            } else {

                if(minHeap.size() > maxHeap.size()){
                    System.out.println(minHeap.peek());
                } else {
                    System.out.println(maxHeap.peek());
                }

            }
        }
    }




}
