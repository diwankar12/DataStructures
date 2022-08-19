package algoExpert.Strings;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.LinkedHashMap;
import java.util.Map;

public class Encoding {

    public static void main(String[] args) {
        System.out.println(runLengthEncoding2("AAAAAAAAAAAAABBCCCCDD"));
        System.out.println(runLengthEncoding2("************^^^^^^^$$$$$$%%%%%%%!!!!!!AAAAAAAAAAAAAAAAAAAA"));
        System.out.println('a');

    }

    public static String runLengthEncoding(String string) {
        // Write your code here.
        StringBuilder sb = new StringBuilder();

        Map<Character,Integer> mp = new LinkedHashMap<>();
        String res ="";
        for(int i=0;i<string.length();i++){
            Character ch = string.charAt(i);
            if(mp.containsKey(ch)){
                if(mp.get(ch)>=9){
                    mp.remove(ch);
                    res += "9"+ch;
                    mp.put(ch,1);
                } else {
                    mp.put(ch,mp.get(ch)+1);
                }
            } else {
                mp.put(ch,1);
            }
        }

        System.out.println(res);

        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            res += String.valueOf(entry.getValue())+entry.getKey();
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        return res ;
    }


    public static String runLengthEncoding2(String string) {
        // Write your code here.
        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for(int i=1;i<string.length();i++){
            if(string.charAt(i)==string.charAt(i-1)){
                if(counter>=9){
                    sb.append(9) ;
                    sb.append(string.charAt(i));
                    counter = 1 ;
                } else {
                    counter++ ;
                }
            } else {
                sb.append(counter);
                sb.append(string.charAt(i-1));
                counter =1 ;
            }
        }


        return sb.toString();
    }

}
