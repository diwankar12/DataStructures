package algoExpert.Array;

public class LongestPeak {

    public static void main(String[] args) {
   // 1,2,3,3,4,0,10,6,5,-1,-3,2,3
        //1,2,3
        System.out.println(getLongestPeak(new int[]{1,2,3,3,4,0,10,6,5,-1,-3,2,3}));
      //  System.out.println(longestPeak(new int[]{5, 4, 3, 2, 1, 2, 1}));
      //  System.out.println(longestPeak(new int[]{1,2,3,2,1,1}));

    }


    public static int longestPeak(int[] array) {
        // Write your code here.
       if(array.length<3) return 0 ;
       int minElementRightSide = array[0] ;
       int minElementIndex = 0 ;
       int maxElement = Integer.MIN_VALUE ;
       int minElementLeftSide = 0;
       int output = 0 ;

       for(int i=1;i<array.length-1;i++){
          //keep track for min element
           if(array[i]<minElementRightSide){
               minElementRightSide = array[i];
               minElementIndex = i ;
           }
          // find the drop
           if(array[i]>array[i+1] && array[i-1]<array[i]){
            output = Math.max(maxElement,(i+2) - (minElementIndex)) ;
           }
       }

        return -1;
    }


    public static int getLongestPeak(int[] array){

     // find the longest peak
     // traverse both sides

        int longestPeak = 0 ;
        int i = 1 ;


        while(i<array.length-1){

            boolean isPeak = array[i]>array[i+1] && array[i-1]<array[i] ;

            if(!isPeak){
                i++;
                continue;
            }
            // once find the peak traverse both sides
            int leftIdx = i-2;
            while(leftIdx>=0 && array[leftIdx]<array[leftIdx+1]){
                leftIdx--;
            }
            int rightIdx = i+2 ;
            while(rightIdx<array.length && array[rightIdx] < array[rightIdx-1] ){
                rightIdx++;
            }
          int currentPeakLength = rightIdx - leftIdx -1 ;
          longestPeak = Math.max(currentPeakLength,longestPeak);
          i = rightIdx ;
        }
       return longestPeak ;
    }




}
