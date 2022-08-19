package algoExpert.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {
    public static void main(String[] args) {

        List<Object> test =
                new ArrayList<Object>(
                        Arrays.asList(
                                5,
                                2,
                                new ArrayList<Object>(Arrays.asList(7, -1)),
                                3,
                                new ArrayList<Object>(
                                        Arrays.asList(6, new ArrayList<Object>(Arrays.asList(-13, 8)), 4))));
        System.out.println(productSum(test));
        //[5, 2, [7, -1], 3, [6, [-13, 8], 4]]
    }

    public static int productSum(List<Object> array) {
        // Write your code here.
        return productSumHelper(array,1) ;

    }

    public static int productSumHelper(List<Object> array , int multiplier){

        int res =0;
        for(Object arr:array){
            if(arr instanceof ArrayList){
                @SuppressWarnings("unchecked")
                ArrayList<Object> ls = (ArrayList<Object>) arr ;
                res+=productSumHelper(ls,multiplier+1) ;
            } else if(arr instanceof Integer) {
                res += (Integer)arr ;
            }
        }
        return multiplier*res;
    }
}