import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {



    public static void main(String[] args) {

       System.out.println(permute("abc"));


    }

  private static List<String> permute(String str){

        List<String> ls = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str);
        helper(sb,0,ls);
        return ls ;
  }




    private static void helper(StringBuilder str,int index , List<String> ls){


        //base case
        if(index==str.length()){
            //System.out.println("STR "+str);
            ls.add(str.toString());
            return ;
        }

      for(int i=index;i<str.length();i++){
          str = swap(index,i,str.toString());
          System.out.println("STR "+str);
          helper(str,i+1,ls);
          str = swap(index,i,str.toString());
      }
  }

//    public static String swap(String a, int i, int j)
//    {
//        char temp;
//        char[] charArray = a.toCharArray();
//        temp = charArray[i] ;
//        charArray[i] = charArray[j];
//        charArray[j] = temp;
//        return String.valueOf(charArray);
//    }

    private static StringBuilder swap(int i,int j,String str){

        char[] chars = str.toCharArray();
        char temp ;
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp ;

        return new StringBuilder(new String(chars));
  }



}
