package HackerRank.Strings;

import java.util.Scanner;

public class ChallengeThree {



  static boolean isAnagram(String a, String b) {
    // Complete the function
    char[] string1 = a.toLowerCase().toCharArray();
    char[] string2 = b.toLowerCase().toCharArray();
    java.util.Arrays.sort(string1);
    java.util.Arrays.sort(string2);
    if(string1.length!= string2.length){

      return false ;
    }
    for(int i=0;i<string1.length;i++){

      if(string1[i] != string2[i]){

        return false ;
      }
    }
    return true ;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }

}
