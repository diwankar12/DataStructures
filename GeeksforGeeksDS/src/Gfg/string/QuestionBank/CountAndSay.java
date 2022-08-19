package Gfg.string.QuestionBank;

public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(3));
//
//        countAndSay(1) = "1"
//        countAndSay(2) = say "1" = one 1 = "11"
//        countAndSay(3) = say "11" = two 1's = "21"
//        countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
    }

    public static String countAndSay(int n) {

        if(n==1){
            return "1";
        }
        if(n==2){
            return "11";
        }

        //count frequency

        String current = "11";


        for(int i=3;i<=n;i++){
            int count =1 ;
            current = current+'$' ;
            String ans = "" ;
            for( int j=1;j<current.length();j++){

                if(current.charAt(j)!=current.charAt(j-1)){

                    ans += String.valueOf(count)+current.charAt(j-1);
                    count = 1;

                } else {
                    count++;
                }

            }
            current = ans ;

        }
        return current  ;
    }

}
