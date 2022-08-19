package Gfg.Recursion;

public class PrintNTo1BackTrack {


    public static void main(String[] args) {

        print(1,3);

    }


    public static void print(int i,int N){
        if(i>N) return;

        print(i+1,N);
        System.out.println(i);


    }
}
