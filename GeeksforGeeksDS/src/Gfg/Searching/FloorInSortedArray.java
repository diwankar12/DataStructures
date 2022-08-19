package Gfg.Searching;

public class FloorInSortedArray {

    public static void main(String[] args) {
        System.out.println(findFloor(new long[]{1,2,8,10,11,12,19},7,20));
    }


    static int findFloor(long arr[], int n, long x)
    {
        int high = n-1;
        int low =0 ;
        long max = -1;
        while(high>=low){

            int mid = (high+low)/2;
            if(x==arr[mid]){
                max=arr[mid-1];
                return (int) max ;
            } else if (x<arr[mid]){
                high= mid-1;
            } else {
                max=arr[mid] ;
                low=mid+1 ;
            }

        }

        for(int i=0;i<arr.length;i++){
            if(max!=-1 && max==arr[i]){
                max=i ;
            }
        }


        return (int) max ;
    }


}
