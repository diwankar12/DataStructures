package algoExpert.Array;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class MonotonicArray {

     static int isIncreasing = 0 ;

    public static void main(String[] args) {
     //   System.out.println(isMonotonic(new int[]{1,1,2,3,3,1}));
       // System.out.println(isMonotonic(new int[]{6,5,4,4}));
        // 1,5,10,1100,1101,1102,9001
        System.out.println(isMonotonic(new int[]{1,5,10,1100,1101,1102,9001}));
        System.out.println(isMonotonic(new int[]{1, 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8, 9, 10, 11}));
    }

    public static boolean isMonotonic(int[] nums) {

       // [1,1,0]  true
       //  [1,1,2]  true
        if(nums.length==1 || nums.length==2 ){
            return true ;
        }
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]==nums[i+1]){
              continue ;
          } else {
              int res = call(nums,i);
              if(res==-1){
                  return false ;
              }
          }
      }
        return true ;

    }

    private static int call(int nums[],int i) {

       // System.out.println(isIncreasing);



      if(isIncreasing==0){
          if(nums[i]<nums[i+1]){
              isIncreasing = 1;
          } else {
              isIncreasing = -1 ;
          }
      } else {
          if(nums[i]>nums[i+1] && isIncreasing==1){
              return -1 ;
          } else if (nums[i]<nums[i+1] && isIncreasing==-1){
              return -1 ;
          }
      }

      return 1 ;

    }


    public static boolean isMonotonic2(int[] array) {
        // Write your code here.
        int direction = array[1] - array[0] ;
        for(int i=2;i<array.length;i++){
            if(direction==0){
                direction = array[i] - array[i-1] ;
                continue ;
            } else {
                return breakDirection(array[i-1],direction,array[i]);
            }
        }


        return true;
    }

    public static boolean breakDirection(int previous,int direction,int current){
        int difference = current - previous ;
        if(direction > 0 && difference < 0 ){
            return false ;
        }
        if (direction < 0 && difference >0){
            return false ;
        }

       return true ;
    }




}
