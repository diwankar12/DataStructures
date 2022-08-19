package Gfg.Array.WindowSliding;

public class WindowSlidingTechnique {


    public static void main(String[] args) {
      //  getMaxSum(new int[]{1,8,30,-5,20,7},3);
        //System.out.println(findSubarray(new int[]{1,8,30,-5,20,7},3,45));

        System.out.println(findSubArrayForGivenSum(new int[]{1,4,20,3,10,5},67));
    }



    //given integers find the max sum of k consecutive number
    public static void getMaxSum(int[] arr,int k){

         int maxCurr = 0;
        for(int i=0;i<k;i++){
            maxCurr += arr[i];
        }
        int max = maxCurr ;
        for(int i=k;i<arr.length;i++){
            maxCurr = maxCurr +  arr[i] - arr[i-k];
            if(max<maxCurr){
                max=maxCurr;
            }
        }

        System.out.println(max);
    }


    //if given sum = 45 , find that subarray
    public static boolean findSubarray(int[] arr,int k,int sum){

        int maxCurr = 0;
        for(int i=0;i<k;i++){
            maxCurr += arr[i];
        }

        for(int i=k;i<arr.length;i++){
            maxCurr = maxCurr +  arr[i] - arr[i-k];

             if(sum==maxCurr){
                 return true ;
             }
        }

       return false ;

    }

    //given a unsorted array of non-negative number , find if there is a subarray with given sum
    // {1,4,20,3,10,5} // sum=33
    public static boolean findSubArrayForGivenSum(int[] arr,int sum){
        int currSum = 0 ;
        for(int i=0;i<arr.length;i++){

            if(currSum + arr[i] > sum){
                currSum = currSum + arr[i] ;
                for(int j=0;j<i;j++){
                    if(currSum - arr[j]==sum){
                        return true ;
                    }
                    currSum = currSum - arr[j] ;
                }
            }
                currSum = currSum + arr[i] ;
        }
        return false ;
    }


//    static boolean isSubSum(int[] arr,int n , int sum){
//
//
//        int currSum = arr[0] ;
//        int s = 0;
//        for(int i=1;i<n;i++){
//
//            while (currSum>sum && s<i-1) {
//                currSum = currSum - arr[s];
//                s++;
//            }
//
//            if(currSum==sum){
//                return true ;
//            }
//
//            if(i<n){
//                currSum = currSum +arr[i];
//            }
//              return (currSum==sum);
//            }
//
//
//
//            return false ;
//
//        }


    // i/p : N=3,m=8
    //o/p : 0 0 1 1 2 4 7 1 3
    // first N-1 digits is always 0 and Nth digit is 1
    public void getNthBonacciNumber(int n,int m){





    }


    //count distinct element in every window of size k
    //i/p : {1,2,1,3,4,3,3}
    //o/p : 3 4 3 2


}
