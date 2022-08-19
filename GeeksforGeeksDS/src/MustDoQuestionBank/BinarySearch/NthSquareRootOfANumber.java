package MustDoQuestionBank.BinarySearch;


/*
   Refer to TUF playlist of binary search
 */

public class NthSquareRootOfANumber {

    public static void main(String[] args) {
        System.out.println(getNthRoot(4,27));
        System.out.println(Math.pow(27,(1.0/(double)4)));
    }

/*
   Time Complexity : root * log base 2 (number *10 ^ d)
   where d is the decimal places between any two integers
   like 1.1,1.2......1.9 it has 10 so tc will be root * log base 2 (number *10 ^ 1)
 */


    public static double getNthRoot(int root,int number){

      double high = number ;
      double low =1 ;
      double eps = 1e-6;  // which is 10 to power of 6
      while(high-low>eps){

          double mid = (low+high) /2.0 ;
          if(multiply(mid,root) > number){
                high = mid ;
          } else {
              low = mid ;
          }
      }

      return low ;

    }

    private static double multiply(double mid, int root) {

        double ans  =1.0 ;
        for(int i=1;i<=root;i++){
             ans = ans * mid ;
        }
        return ans ;


    }


}
