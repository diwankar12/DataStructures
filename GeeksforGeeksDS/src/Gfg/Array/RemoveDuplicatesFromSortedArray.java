package Gfg.Array;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] arr ={10,20,20,30,30,40,30};

        System.out.println(getDistinctSize(arr));


    }


    public static int getDistinctSize(int[] arr){

        // 10,20,20,30,30,30,30
        // 10,20,30,

        int res =1 ;

        for(int i=1;i<arr.length;i++){

            if(arr[i]!= arr[res-1]){

                arr[res] = arr[i] ;
                res++ ;
            }
        }
        return res ;

    }

}
