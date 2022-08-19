package Gfg.Recursion;

public class RodWithSizes {

    public static void main(String[] args) {


        System.out.println(cutRods(23,11,9,12));
        System.out.println(cutRods(8,2,3,4));
    }

    public static int cutRods(int n,int a,int b,int c){


        if(n==0){
            return 0 ;
        }

        if(n<0){
            return -1 ;
        }


        int res = Math.max(Math.max(cutRods(n-a,a,b,c),cutRods(n-b,a,b,c)),cutRods(n-c,a,b,c));

        if(res==-1){
            return -1 ;
        }

        return res+1 ;

    }


}
