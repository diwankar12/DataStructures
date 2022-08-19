package algoExpert.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoveElementToEnd {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(2,1,2,2,2,3,4,2);
        int toMove = 2 ;
        System.out.println((moveElementToEnd(values,toMove)).toString());




    }
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        Map<Integer,Integer> mp = new HashMap<>();
        int count = 0;
        for(int i=0;i<array.size();i++){
            if(array.get(i)!=toMove){
                mp.put(count,array.get(i));
                count++ ;
            }
        }

        for(int i=0;i<array.size();i++){
            if(mp.containsKey(i)){
                array.set(i,mp.get(i)) ;
            } else {
                array.set(i,toMove) ;
            }
        }


        return array ;
    }
}
