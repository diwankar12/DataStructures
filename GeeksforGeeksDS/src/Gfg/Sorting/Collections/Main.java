package Gfg.Sorting.Collections;

import Gfg.Sorting.Arrays.ComparatorObj;
import Gfg.Sorting.Arrays.Coordinates;
import Gfg.Sorting.Arrays.Points;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Points> list = new ArrayList<>();
        list.add(new Points(1,2));
        list.add(new Points(98,21));
        list.add(new Points(0,56));

        Collections.sort(list, new ComparatorObj());
        for(Points points:list){
            System.out.println(points.getX() +"  "+points.getY());
        }
        System.out.println("==============================");
        // using comparable
        List<Coordinates> list1 = new ArrayList<>();
        list1.add(new Coordinates(1,2));
        list1.add(new Coordinates(98,21));
        list1.add(new Coordinates(0,56));
        Collections.sort(list1);
        for(Coordinates points:list1){
            System.out.println(points.getX() +"  "+points.getY());
        }

    }
}
