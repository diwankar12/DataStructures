package algoExpert.Strings;

public class Encryptor {


    public static void main(String[] args) {
       System.out.println(caesarCypherEncryptor("xyz",2));
        System.out.println(caesarCypherEncryptor("abc",52));
    }
    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        String res = "";
        if(key==0){
            return str ;
        }
        key = key%26;
        for(int i=0;i<str.length();i++){
            int ch = (int)str.charAt(i);
              int val = (ch+key);
            System.out.println(val);
               if(val <=122){
                   res+=(char) val ;
               }
               else {
                   res+= (char) (96 +val%122);

               }
        }

        return res;
    }


}
