package Gfg.Array;

import java.util.HashMap;
import java.util.Map;

public class FrequenciesOfLimitedRange {


    public static void main(String[] args) {

        frequencycount(new int[]{2,3,2,3,5},5);
        System.out.println();
        frequencycount(new int[]{3,3,3,3},4);

    }

    public static void frequencycount(int arr[], int n)
    {
        // code here
      Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){

                mp.put(arr[i],mp.get(arr[i])+1);
            } else {
                mp.put(arr[i],1);
            }
        }



        for(int i=1;i<n+1;i++){

            if(mp.containsKey(i)){

                System.out.print(mp.get(i)+" ");
            } else {
                System.out.print("0 ");
            }



        }

    }
}
