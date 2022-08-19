package algoExpert.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {


        List<List<Integer>> ans =  getPermutations(Arrays.asList(1,2,3));
        for(List<Integer> elem: ans){
            System.out.println(elem.toString());
        }


    }

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here.
        if(array.size()<=0){
            return new ArrayList<>();
        }
        List<List<Integer>> ans = new ArrayList<>();
        permuteUtil(array,ans,0);
        return ans ;
    }


    private static void permuteUtil(List<Integer> array,List<List<Integer>> ans ,int index){

        //base case
        if(index==array.size()){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<array.size();i++){
                list.add(array.get(i));
            }
            ans.add(list) ;
            return ;
        }

        //swapping

       // for(int i=index;i<array.size();i++){
            Collections.swap(array,index,0);
            permuteUtil(array,ans,index+1);
            Collections.swap(array,index,0);
       // }

    }




}
