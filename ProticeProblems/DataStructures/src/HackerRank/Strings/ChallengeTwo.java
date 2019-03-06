package HackerRank.Strings;

import java.util.Scanner;

public class ChallengeTwo {


  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A = sc.next();
    String result  = isPalindrome(A);
    System.out.println(result);


  }

  private static String isPalindrome(String A) {

    char[] arraychar = A.toCharArray();
    if (arraychar.length <= 50) {
      /* Enter your code here. Print output to STDOUT. */
      for (int i = 0; i < arraychar.length; i++) {

        if (arraychar[i] != arraychar[arraychar.length - 1 - i]) {
          return "No";
        }

      }


    }
    return "Yes";
  }
}
