package algoExpert.Recursion;

import java.util.HashMap;
import java.util.Map;

public class StaircaseTraversal {

    public static void main(String[] args) {
        System.out.println(staircaseTraversal(4,2));
        //System.out.println(staircaseTraversal(3,2));
        //System.out.println(climbStairs(2));
    }

    public static int staircaseTraversal(int height, int maxSteps){
        HashMap<Integer,Integer> memoData = new HashMap<>();
        memoData.put(0,1) ;
        memoData.put(1,1) ;
        return getStairValue(height,maxSteps,memoData) ;
    }



    public static int getStairValue(int height, int maxSteps,HashMap<Integer,Integer> memoData) {



            if (memoData.containsKey(height)) {
                return memoData.get(height);
            }
            // loop depends upon how many recursive solution
            int sum = 0 ;
            for(int i=1; i<maxSteps;i++){
                sum+= getStairValue(height-i,maxSteps,memoData);
            }
            memoData.put(height,sum);
            return sum;
    }

    public static int climbStairs(int n) {
        if(n==0){
            return 1 ;
        }
        if(n<0){
            return 0;
        }
        int count1 = climbStairs(n-1);
        int count2 = climbStairs(n-2);
        return count1+count2 ;
    }

}
