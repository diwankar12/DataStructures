package algoExpert.StacksAndQueue;

import java.util.ArrayList;
import java.util.Stack;

public class SunsetViews {

    public static void main(String[] args) {
        System.out.println(sunsetViews(new int[]{3,5,4,4,3,1,3,2},"EAST"));
        System.out.println(sunsetViews(new int[]{3,5,4,4,3,1,3,2},"WEST"));

        StringBuilder sb = new StringBuilder("wert");
        System.out.println(sb.length());
    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        if(buildings.length==0){
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> interStack = new Stack<>();
        int size = buildings.length;
        int max ;
        if(direction.equals("EAST")){
            max=buildings[size-1];
            interStack.push(size-1);
            for(int i=size-2;i>=0;i--){
                if(buildings[i]>max){
                    interStack.push(i);
                    max=buildings[i] ;
                }
            }
            while(interStack.size()>0){
                result.add(interStack.pop());
            }

        } else if (direction.equals("WEST")) {
            max=buildings[0];
            result.add(0);
            for(int i=1;i<buildings.length;i++){
                if(buildings[i]>max){
                    result.add(i);
                    max=buildings[i] ;
                }
            }


        }

        return result;
    }



}
