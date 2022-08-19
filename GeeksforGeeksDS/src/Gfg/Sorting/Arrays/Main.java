package Gfg.Sorting.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        // primitive type arrays sorting
        int[] arr1 = new int[]{49,123,6,90,5};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("=============================================");

        //non primitive type sorting and reversing
        Integer[] arr = new Integer[]{49,123,6,90,5};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        System.out.println("=============================================");

        // using comparable and compareTo to sort the objects
        Coordinates[] pointers = new Coordinates[]{new Coordinates(1,5)
                ,new Coordinates(98,4)
                ,new Coordinates(0,76)
                ,new Coordinates(2,67)};

        Arrays.sort(pointers);
        for(int i=0;i<pointers.length;i++){
            System.out.println(pointers[i].getX()+" " + pointers[i].getY());
        }

        System.out.println("=============================================");
        // using comparator to sort the objects of non primitive type
        Points[] points = new Points[]{new Points(1,5)
                ,new Points(98,4)
                ,new Points(0,76)
                ,new Points(2,67)};
        Arrays.sort(points,new ComparatorObj());
        for(int i=0;i<pointers.length;i++){
            System.out.println(points[i].getX()+" " + points[i].getY());
        }


    }



}
