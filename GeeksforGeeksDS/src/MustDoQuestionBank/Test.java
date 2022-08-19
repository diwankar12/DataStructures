package MustDoQuestionBank;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {


     String startUrl = "http://news.yahoo.com" ;
     String testUrl = "http://news.yahoo.com/news/topics/" ;

        System.out.println(Arrays.toString(testUrl.split("/")));

        String[] split = testUrl.split("/") ;

        String domain = split[0] + "//" + split[2];
        System.out.println(domain);


        String str = "4123" ;
        Object obj = str.charAt(0)-'0' ;

        System.out.println(obj.getClass());

    }






}
