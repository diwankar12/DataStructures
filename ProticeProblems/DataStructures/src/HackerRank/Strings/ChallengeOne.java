package HackerRank.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ChallengeOne {

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    ArrayList<String> words = new ArrayList<>();
    for(int i =0;i<=s.length()-k;i++){

     String truncated = s.substring(i,k+i);
     words.add(truncated);

    }
    System.out.println(words);
    Collections.sort(words);
    smallest= words.get(0);
    int largestnum =words.size();
    largest = words.get(largestnum-1);

    return smallest + "\n" + largest;
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
  }
}
