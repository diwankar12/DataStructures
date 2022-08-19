package algoExpert.Array;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateSusequence {


        public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
            // Write your code here.
            Map<Integer,Integer> mp = new HashMap<>();

            int count = 0 ;
            for(Integer listElem:array){
                mp.put(listElem,count);
                count++ ;
            }
            int countFinal = 0 ;
            Map<Integer, Boolean> mp2 = new HashMap<>();
            for(Integer resElem:sequence){
                if(mp.containsKey(resElem) && countFinal<=mp.get(resElem) && !mp2.get(resElem)){
                    countFinal = mp.get(resElem);
                    mp2.put(resElem,true);
                } else {
                    return false ;
                }
            }
            return true;
        }




    }







