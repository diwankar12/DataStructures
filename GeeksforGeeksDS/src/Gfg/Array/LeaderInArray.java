package Gfg.Array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray {


    public static void main(String[] args) {


        findLeader(new int[]{16,17,4,3,5,2},6);
        System.out.println();
        findLeader(new int[]{7,10,4,3,6,5,2},7);

    }

   public static void findLeader(int[] arr,int size){

        for(int i=0;i<size;i++){
            int j;
            for( j=i+1;j<size;j++){
                if(arr[i]<= arr[j]){
                    break ;
                }

            }
          //  System.out.println("j value "+j);
            if(j==size){
                System.out.print(arr[i]+" ");
            }


        }

     //  System.out.print(arr[size-1]);


   }

    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here

        int currElement = arr[n-1] ;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(currElement);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=currElement){
                list.add(arr[i]);
                currElement = arr[i];
            }
        }
        Collections.reverse(list);
        return list ;


    }
}


