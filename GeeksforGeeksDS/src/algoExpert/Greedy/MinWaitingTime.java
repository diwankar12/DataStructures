package algoExpert.Greedy;

import java.util.Arrays;

public class MinWaitingTime {

    public static void main(String[] args) {
        System.out.println(minimumWaitingTime(new int[]{3,2,1,2,6}));
    }


    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries) ;

        int ans = 0;
        int sum =0 ;
        for(int i=1;i<queries.length;i++){
            System.out.println(ans);
            ans += queries[i-1] ;
            sum+=ans ;


        }


        return sum;
    }



}
