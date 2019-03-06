package HackerRank.DS;

import java.util.Scanner;

public class SubArray {


  public static void main(String[] args) {
//
    Scanner scan = new Scanner(System.in);
    int numofelem = scan.nextInt();
    scan.nextLine();
    // 5
    // 1 -2 4 -5 1

    String[] arr = scan.nextLine().split(" ");
    int[] intarr = new int[numofelem];
    for (int i = 0; i < numofelem; i++) {
      if (numofelem == arr.length) {
        intarr[i] = Integer.parseInt(arr[i]);
      }
    }

    int res = 0;

    for (int i = 0; i < numofelem; i++) {
      //sum always start from 0 after one iteration

      int sum = 0;
      for (int j = i; j < numofelem; j++) {
        sum = sum + intarr[j];
        if (sum < 0) {

          res++;
        }
      }


    }

    System.out.println(res);

  }

}
