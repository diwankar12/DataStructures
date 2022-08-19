package Gfg.Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortASortedArray {


    // Theory : the value present at index 0 will be minimum and at the max i+k distance away .
    //

    public static void main(String[] args) {

        getNearlySortedArray(new int[]{4,3,1,2,5},2);


    }



    public static void getNearlySortedArray(int[] arr , int k){


        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<=k;i++){
            pq.add(arr[i]);
        }

        int index = 0 ;

        for(int i=k+1;i<arr.length;i++){
            arr[index] = pq.poll();
            index++ ;
            pq.add(arr[i]);
        }


        while(!pq.isEmpty()){

            arr[index] = pq.poll();
            index++ ;
        }


        System.out.println(Arrays.toString(arr));


    }



}
