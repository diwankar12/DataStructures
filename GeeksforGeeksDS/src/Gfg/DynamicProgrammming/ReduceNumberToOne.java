package Gfg.DynamicProgrammming;

public class ReduceNumberToOne {

    private static int number ;
   private static int[] dp = new int[number+1] ;


    public static void main(String[] args) {

    }


    //convert number to 1
    // condition
    // 1. if n is divisble by 3 you can do n/3
    // 2. if n is divisible by 2 you can do n/2
    // 3. or you can reduce to n to n-1

    public static int reduceNum(int num){

        if(num==1){
            return 0 ;
        }

        if(num ==2){
            return 1 ;
        }

        if(num==3){
            return 1 ;
        }
        int ans1 = Integer.MAX_VALUE;
        int ans2 = Integer.MAX_VALUE;
        int ans3;

        if(num%2==0){
           ans1 = 1+ reduceNum(num/2);
        }
         if(num%3==0){
          ans2= 1  + reduceNum(num/3);
        }

         ans3 = 1 + reduceNum(num-1);

         return Math.min(ans1,Math.min(ans2,ans3));

    }

   // given a number n , you have to convert this number to 1
   // 1. if n is divisible by 3, you can do n/3
   // 2. if n is divisible by 2, you can do n/2
   // 3. or you can reduce to n to n-1

    public static int reduceNumMemo(int number){



        if(dp[number]!=0){
            return dp[number] ;
        }

        if(number==1){
            return 0 ;
        }

        if(number ==2){
            return 1 ;
        }

        if(number==3){
            return 1 ;
        }
        int ans1 = Integer.MAX_VALUE;
        int ans2 = Integer.MAX_VALUE;
        int ans3;

      if(number%2==0){
           ans1 =  1+reduceNumMemo(number/2);
      }

        if(number%3==0){
             ans2 = 1+reduceNumMemo(number/3);
        }

         ans3 =  1+reduceNumMemo(number-1);

        dp[number] = Math.min(ans3,Math.min(ans1,ans2));

        return dp[number] ;


    }



    private static int reduceNumTab(int number){

        int[] tab = new int[number+1] ;
        tab[1] =0;
        tab[2] =1 ;
        tab[3] =1 ;

        for(int i=4;i<tab.length;i++){
            tab[i] = i-1 ;
            if(i%2==0){
                tab[i] =  Math.min(1+tab[i/2],tab[i]);
            }

            if(i%3==0){
                tab[i] = Math.min(1+tab[i/3],tab[i]);
            }
        }
        return tab[number] ;
    }




































}
