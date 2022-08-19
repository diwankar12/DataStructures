package Gfg.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortAnArrayAccordingToOtherArray {

    public static void main(String[] args) {
//        1
//        20 4
//        9 9 9 9 1 1 1 1 2 2 2 2 3 4 4 4 3 9 8 10
//        8 2 1 3
        int[] A1 = new int[]{9, 9, 9, 9, 1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 3, 9, 8, 10};
        int[] A2 = new int[]{8,2,1,3};
        int N= 20 ;
        int M = 4;
        System.out.println(Arrays.toString(sortA1ByA2(A1,N,A2,M)));
    }

    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        //Your code here
        Map<Integer,Integer> mp = new TreeMap<>();
        int[] res = new int[A1.length];
        for(int i=0;i<A1.length;i++){
            mp.put(A1[i],mp.getOrDefault(A1[i],0)+1);
        }
        int count =0 ;
        for(int i=0;i<A2.length;i++){
            if(mp.containsKey(A2[i]) && mp.get(A2[i])>0){
                int limit = mp.get(A2[i]);
                for(int k=0;k<limit;k++){
                    System.out.println(A2[i] + "value "+mp.get(A2[i]));
                    System.out.println("value of k "+k);
                    res[count] = A2[i] ;
                    mp.put(A2[i],mp.get(A2[i])-1);
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(res));
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
             System.out.println("Key ="+entry.getKey() + ",value ="+entry.getValue());
            if(entry.getValue()==1){
                res[count] = entry.getKey();
                count++;
            } else if(entry.getValue()>1){
                for(int i=0;i<entry.getValue();i++){
                    res[count] = entry.getKey();
                    count++ ;
                }
            }
        }




        return res ;

    }

}
