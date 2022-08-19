package algoExpert.Searching;

public class ShiftedBinarySearch {

    public static void main(String[] args) {


        System.out.println(shiftedBinarySearch(new int[]{45,61,71,72,73,0,1,21,33,37},33));
    }

    public static int shiftedBinarySearch(int[] array, int target) {
        // Write your code here.
        int index = 0 ;
        int low ;
        int high ;
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1]){
                index = i ;
            }
        }
        if(target > array[array.length-1]){
            low = 0 ;
            high = index-1 ;
        } else {
            low = index ;
            high = array.length-1 ;
        }

        while(low<=high){
            int mid = low + (high-low)/2 ;
            if(array[mid]==target){
                return mid ;
            } else if (array[mid]>target){
                high = mid-1 ;
            } else {
                low = mid+1 ;
            }
        }
        return -1;
    }
}
