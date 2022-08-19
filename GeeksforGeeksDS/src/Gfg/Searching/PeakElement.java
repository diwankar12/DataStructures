package Gfg.Searching;

public class PeakElement {

    public static void main(String[] args) {

        System.out.println(peakElement(new int[]{1,2,3,},3));


    }

    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        // naive soln
        int max = Integer.MIN_VALUE ;
        int res = -1 ;
        if(n==1){
            res = 0 ;
            return res ;
        }
        for(int i=0;i<n;i++){

            if(i==0 && arr[i] > arr[i+1] && arr[i]>max){
                max = arr[i] ;
                res = i ;
            } else if (i==n-1 && arr[i]>arr[i-1] && arr[i]>max){
                max = arr[i] ;
                res = i ;
            } else if(i!=n-1 && arr[i]>arr[i+1] && arr[i]>arr[i-1] && arr[i]>max) {
                max = arr[i] ;
                res = i ;
            }
        }
        if(res!=-1){
            return res ;
        } else {
            return 0 ;
        }
    }



}
