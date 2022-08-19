package algoExpert.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Powerset {

    public static void main(String[] args) {

        List<List<Integer>> powerSet = getPowerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));

    }


    public static List<List<Integer>> getPowerSet(List<Integer> array){

        List<List<Integer>> mainList = new ArrayList<>();
        mainList.add(new ArrayList<>());

        for(Integer elem:array){
            int length = mainList.size();
            System.out.println("For elem "+elem);
            for(int i=0;i<length;i++){
                System.out.println("mainList Before "+mainList.toString());
                List<Integer> list = new ArrayList<>(mainList.get(i));
                System.out.println("Before adding "+list.toString());
                list.add(elem);
                System.out.println("after adding elem "+list);
                mainList.add(list);
                System.out.println("mainList "+mainList.toString());

            }
            System.out.println("=============");
        }
   return mainList ;
    }

}
