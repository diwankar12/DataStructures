package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

  // Create a program using arrays that sorts a list of integers in descending order.
  // Descending order is highest value to lowest.
  // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
  // ultimately have an array with 106,81,26, 15, 5 in it.
  // Set up the program so that the numbers to sort are read in from the keyboard.
  // Implement the following methods - readIntegers, printArray, and sortIntegers
  // readIntegers returns an array of entered integers from keyboard
  // printArray prints out the contents of the array
  // and sortIntegers should sort the array and return a new array containing the sorted numbers
  // you will have to figure out how to copy the array elements from the passed array into a new
  // array and sort them and return the new sorted array.


  public Integer[] getIntegers() {
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


  public Integer[] sortedArray(Integer[] intArr) {

    // this works on merge sort algorithm
//    Arrays.sort(intArr, Collections.reverseOrder());
//    System.out.println("Sorted Array :" +Arrays.toString(intArr));

    //this works on bubble sort algorithm which is less efficient

    Integer[] sortedArray = Arrays.copyOf(intArr, intArr.length);

    boolean flag = true;
    int temp;
    while (flag) {
      flag = false;
      for (int i = 0; i < sortedArray.length - 1; i++) {
        //1 2

        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;

        }
      }

    }
return sortedArray;


  }

}
