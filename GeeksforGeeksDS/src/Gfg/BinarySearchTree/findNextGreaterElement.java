package Gfg.BinarySearchTree;

import java.util.Arrays;

public class findNextGreaterElement {


    public static void main(String[] args) {

        System.out.println(almostIncreasingSequence(new int[]{1,2,5,3,5}));

        //1,2,5,3,5

        //1, 2, 3, 4, 99, 5, 6
        //[3, 6, 5, 8, 10, 20, 15]
    }



    public static boolean almostIncreasingSequence(int[] sequence) {


        int p1 =0;
        int p2 =1 ;
        int counter = 0;
        int currentCounter = 0 ;
        if(sequence[p1]>=sequence[p2]){
            counter++;
            p1++;
            p2++ ;
        }


        while(p2<sequence.length){

            if(sequence[p1]>=sequence[p2]){
                System.out.println("=======");
                System.out.println(sequence[p1]);
                System.out.println(sequence[p2]);
                System.out.println("=======");
                counter++ ;
                p2++ ;
                currentCounter ++ ;
            } else {
                if(currentCounter>=1){
                    p2++ ;
                    p1=p2 ;

                } else {
                    p1++;
                    p2++ ;
                }
            }
        }



        if(counter>=2){
            return false ;
        } else {

            return true;
        }

    }






}
