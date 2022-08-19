package Gfg.DynamicProgrammming;

import java.math.BigInteger;
import java.util.Arrays;

public class CatalanNumber {

    public static void main(String[] args) {
        System.out.println(findCatalan(15));
       // System.out.println(factorialRecursive(12)*13);
    }


    public static BigInteger findCatalan(int n)
    {
        //Your code here
        //Cn = (2n)! / ((n + 1)!n!)

        if(n==0) {
            return BigInteger.ONE ;
        }
        BigInteger[] factArray = new BigInteger[2*n+1] ;
        factArray[1] = BigInteger.ONE ;
        factArray[0] = BigInteger.ONE ;
        for(int i=2;i<factArray.length;i++){

            factArray[i] = factArray[i-1].multiply(BigInteger.valueOf(i))  ;
        }

//        System.out.println(Arrays.toString(factArray));
//        System.out.println(factArray[12]);
//        System.out.println((factArray[12] * 13));
        BigInteger demo = (factArray[n+1].multiply(factArray[n]));
        if(!demo.equals(BigInteger.ZERO)) {
            return factArray[2*n].divide(demo) ;

        }

        return factArray[2*n] ;
    }

    public static long factorialRecursive( long n )
    {
        return n == 1 ? 1 : n * factorialRecursive( n-1 );
    }

}
