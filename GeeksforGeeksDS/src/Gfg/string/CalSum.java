package Gfg.string;

public class CalSum {


    public static void main(String[] args) {


        //str = 123tyu67
        System.out.println(getSum("123ty123u67"));

    }


   private static int getSum(String str){

        String tempString = "0";
        int sum = 0 ;

     for(int i=0;i<str.length();i++){

     if(Character.isDigit(str.charAt(i))){
         tempString = tempString + str.charAt(i);
         //tempString = 123
         //tempString = 123
         //tempString = 67
     } else {
         sum = sum + Integer.parseInt(tempString); // 0+123 + 123
         tempString="0";
     }

     }

    return sum +Integer.parseInt(tempString);


   }


}

