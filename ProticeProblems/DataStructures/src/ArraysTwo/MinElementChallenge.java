package ArraysTwo;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

  public Integer[] readIntegers() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the count of numbers to be sort");
    int num = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the " + num + " elements ");

    Integer[] intArr = new Integer[num];
    for (int i = 0; i < num; i++) {

      int j = scanner.nextInt();
      intArr[i] = j;

    }
    System.out.println(Arrays.toString(intArr));
    return intArr;

  }


  public void printArray(Integer[] intArr) {

    for (int i = 0; i < intArr.length; i++) {

      int j = intArr[i];
      System.out.println(j);

    }

  }


  public int findMin(Integer[] intArr) {

    // this is using inbuilt function
//    int min = Collections.min(Arrays.asList(intArr));
//    System.out.println(min);

    // this is using brute force
    int temp  ;
    for (int i = 0; i < intArr.length - 1; i++) {
      if (intArr[i] < intArr[i + 1]) {
        temp = intArr[i]  ;
        intArr[i + 1] = intArr[i];
        intArr[i+1] = temp;


      }


    }

    return intArr[intArr.length-1];


  }


}
