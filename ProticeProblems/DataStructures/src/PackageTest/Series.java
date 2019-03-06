package PackageTest;



// Create a suitably named package containing a class called Series
// with the following static methods:
// nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
// 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
// 0, 1, 2, 3,  4,  5, 6,  7,  8,   9, 10
// factorial(int n) returns the product of all numbers from 1 to n
//      i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
// The first 10 factorials are:
// 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
//
// fibonacci(n) returns the nth Fibonacci number. These are defined as:
// f(0) = 0
// f(1) = 1
// f(n) = f(n-1) + f(n-2)
// (so f(2) is also 1. The first 10 fibonacci numbers are:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
//
// When you have tested your functions, delete the Main class and
// produce a jar file.
//
// Create a new project and add your Series library, then test the
// three methods in the main() method of your new project.


import java.util.ArrayList;

public class Series {


    public static void main(String[] args) {
        System.out.println(SumNumbers(10));
        System.out.println(Factorial(10));
        System.out.println(Fibonacci(10));
    }

    public static ArrayList<Integer> SumNumbers(int n){

        int j = 0;
        ArrayList<Integer> addnum = new ArrayList<>();

        for(int i =0;i<n+1;i++){
             j = (i * (i+1) ) / 2 ;
            addnum.add(j);
        }
       return  addnum;
    }

    public static ArrayList<Integer> Factorial(int num){

         int fact = 1 ;
        ArrayList<Integer> addnum = new ArrayList<>();
        for(int j =1;j<num+1;j++){

                fact = fact * j;
                addnum.add(fact);
            }
         addnum.add(0,0);
         return addnum ;

    }


    public static ArrayList<Integer> Fibonacci(int num) {

        // fibonacci(n) returns the nth Fibonacci number. These are defined as:
// f(0) = 0
// f(1) = 1
// f(n) = f(n-1) + f(n-2)
// (so f(2) is also 1. The first 10 fibonacci numbers are:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
        ArrayList<Integer> addnum = new ArrayList<>();
        int n1 = 0;
        int n2 = 1 ;
        for (int i =2;i<num+1;i++){

            int n3 = n1 + n2 ;
            addnum.add(n3) ;
            n1 = n2 ;
            n2 = n3 ;


        }



        addnum.add(0,0);
        addnum.add(1,1);
        return addnum;

    }


}
