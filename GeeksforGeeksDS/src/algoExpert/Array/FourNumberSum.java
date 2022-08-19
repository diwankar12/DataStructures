package algoExpert.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourNumberSum {

    public static void main(String[] args) {

        List<Integer[]> ans = fourNumberSum(new int[]{1,2,3,4,5,6,7},10);
        for(Integer[] ls : ans){
            System.out.println(Arrays.toString(ls));
        }


    }

    public static List<Integer[]> fourNumberSum(int[] array, int target) {
        // Write your code here.
        List<Integer[]> ans = new ArrayList<>();
        Arrays.sort(array);


        for(int i=0 ;i<array.length;i++){
            int target_3 = target - array[i] ;
            for(int j=i+1;j<array.length;j++){
                int newTarget = target_3 - array[j];
                int left = j+1 ;
                int right = array.length-1 ;
                while(left<right){
                    int sum = array[left]+array[right];
                    if(sum<newTarget){
                        left++;
                    } else if(sum>newTarget) {
                        right-- ;
                    } else {
                        ans.add(new Integer[]{array[i],array[left],array[right],array[j]});
                        left++;
                        right--;
                    }
                }
            }

        }
        return ans ;
    }


}
