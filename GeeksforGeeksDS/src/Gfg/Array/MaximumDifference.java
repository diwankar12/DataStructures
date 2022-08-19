package Gfg.Array;

public class MaximumDifference {
    public static void main(String[] args) {

        System.out.println(maxIndexDiff(new int[]{2,3,10,6,4,8,1},7));
    }

    static int maxIndexDiff(int arr[], int n) {

        // Your code here
        int result = arr[1] -arr[0] ;
        int minValue = arr[0] ;

        for(int i=1;i<n;i++){

            if(arr[i] - minValue > result){
                result = arr[i] - minValue ;
            }
            if(minValue > arr[i]){
                minValue= arr[i] ;
            }
        }


        return result ;

    }
}
