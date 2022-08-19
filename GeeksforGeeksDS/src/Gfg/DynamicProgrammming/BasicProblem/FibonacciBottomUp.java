package Gfg.DynamicProgrammming.BasicProblem;

public class FibonacciBottomUp {



    public long findNthFibonacci(int number)
    {
        // Your Code Here
        long[] fib = new long[number+1] ;
         fib[0] = 0 ;
         fib[1] = 1 ;
        for(int i=2;i<=number;i++){
            fib[i] = fib[i-1] + fib[i-2] ;
        }

        return fib[number] ;

    }
}
