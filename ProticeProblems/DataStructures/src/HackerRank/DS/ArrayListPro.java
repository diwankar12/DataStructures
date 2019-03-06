package HackerRank.DS;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPro {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    5
//    5 41 77 74 22 44
//    1 12
//    4 37 34 36 52
//    0
//    3 20 22 33
//    5
//    1 3
//    3 4
//    3 1
//    4 3
//    5 5

    Scanner scan = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> finalArr = new ArrayList<>();
    int input = scan.nextInt();
    for (int i = 0; i < input; i++) {
      int input2 = scan.nextInt();
      ArrayList<Integer> ifirstArray = new ArrayList<>();
      for (int j = 0; j <= input2 - 1; j++) {
        ifirstArray.add(scan.nextInt());
      }
      finalArr.add(ifirstArray);
    }
    int input3 = scan.nextInt();

    for(int k=0;k<=input3-1;k++){
        ArrayList<Integer> endres = finalArr.get(scan.nextInt()-1);


      try {
        System.out.println(endres.get(scan.nextInt()-1)) ;

      }catch (IndexOutOfBoundsException e){
        System.out.println("ERROR!");

      }



    }
  }
}
