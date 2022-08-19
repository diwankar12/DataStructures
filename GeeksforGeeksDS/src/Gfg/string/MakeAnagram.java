package Gfg.string;

import java.util.*;

public class MakeAnagram {

    public static void main(String[] args) {


        String s = "Geeks" ;
        String original = "defRTSersUXI";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
        System.out.println(Character.isUpperCase(s.charAt(0)));


        String str = "defRTSersUXI";
        String uppercase = "";
        String lowercase = "" ;
        List<Integer> upperCaseIndexList = new ArrayList<>();
        List<Integer> lowerCaseIndexList = new ArrayList<>();
        for(int i=0;i<str.length();i++){

            if(Character.isUpperCase(str.charAt(i))){
                uppercase = uppercase+str.charAt(i);
            } else {
                lowercase=lowercase+str.charAt(i) ;
            }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                upperCaseIndexList.add(i);
            }
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                lowerCaseIndexList.add(i);
            }
        }

        System.out.println(uppercase);
        System.out.println(lowercase);
        System.out.println(upperCaseIndexList.toString());

        int count1 =0;
        int count2=0 ;
        for(int i=0;i<str.length();i++){

            StringBuilder sb = new StringBuilder(str);
            if(upperCaseIndexList.contains(i)){
                sb.setCharAt(i,uppercase.charAt(count1));
                count1++;
            } else {
                sb.setCharAt(i,lowercase.charAt(count2));
                count2++;
            }
        }

        System.out.println(str);

    }


    public static boolean areIsomorphic(String S1,String S2){




        if(S1.length()!=S2.length()){
            return false;
        }
        int count1[] = new int[256];
        int count2[] = new int[256];
        for(int i = 0; i < S1.length(); i++){
            if(count1[S1.charAt(i)] != count2[S2.charAt(i)]){
                return false;
            }else{
                count1[S1.charAt(i)]++;
                count2[S2.charAt(i)]++;
            }
        }
        return true;
    }
}
