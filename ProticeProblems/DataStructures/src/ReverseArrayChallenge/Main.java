package ReverseArrayChallenge;

public class Main {

  public static void main(String[] args) {

//    -Write a method called reverse() with an int array as a parameter.
//
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//    -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.

      ReverseArray reverseArray = new ReverseArray();
      int[] intArr = {21,24,89,90,67,44,54};
      reverseArray.reverse(intArr);




  }

}
