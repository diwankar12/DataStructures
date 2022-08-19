package algoExpert.Recursion;

public class RodCutting {


    public static void main(String[] args) {

        System.out.println(rodCutting(9,2,2,2));



    }

    public static int rodCutting(int n,int a,int b,int c){
        if(n==0){
            return 0 ;
        }

        if(n<0){
            return -1 ;
        }

        int ans1 = rodCutting(n-a,a,b,c);
        int ans2 = rodCutting(n-b,a,b,c);
        int ans3 = rodCutting(n-c,a,b,c);

        int res =  Math.max(ans1,Math.max(ans2,ans3));
        if(res==-1){
            return -1;
        }
       return res+1 ;




    }


}
