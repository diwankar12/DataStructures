package Gfg.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {

        Item[] item = new Item[3] ;
        item[0] = new Item(400,30);
        item[1] = new Item(500,20);
        item[2] = new Item(600,50);
        System.out.println(fractionalKnapsack(70,item,3));


    }


   static double  fractionalKnapsack(int W, Item arr[], int n)
    {
        // Your code here
        double ans = 0.0 ;
        Arrays.sort(arr,new WeightByValueComparator());
        for (int i=0;i<n;i++) {
            if(W-arr[i].weight >=0){
                ans += arr[i].value ;
                W -= arr[i].weight ;
            } else {
                ans+=  (arr[i].value * ( (double) W/(double)(arr[i].weight)));
                break ;
            }
        }
      return ans;
    }


    static class WeightByValueComparator implements Comparator<Item>
    {


        @Override
        public int compare(Item o1, Item o2) {
            int weightByValueOne = o1.value / o1.weight ;
            int weightByValueTwo = o2.value / o2.weight ;
            return  weightByValueTwo -  weightByValueOne;
        }
    }





    static class Item{

        int value, weight;
        Item(int value, int weight){
            this.value = value;
            this.weight = weight;
        }


    }

}
