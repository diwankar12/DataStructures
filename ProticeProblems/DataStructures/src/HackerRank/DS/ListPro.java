package HackerRank.DS;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPro {

    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


//
//      5
//      12 0 1 78 12
//      2
//      Insert
//      5 23
//      Delete
//      0

      //0 1 78 12 23

      Scanner scan = new Scanner(System.in);
      int input = scan.nextInt();
      List<Integer> listpro = new ArrayList<>();
      for(int i =0;i<input;i++){
        listpro.add(i,scan.nextInt());
      }
      int input2 = scan.nextInt();
      for(int k =0;k<input2;k++){
        String action = scan.next();
        if(action.equals("Insert")){
          listpro.add(scan.nextInt(),scan.nextInt());
        }else if (action.equals("Delete")){
          listpro.remove(scan.nextInt());

        }

      }
      for(int val:listpro){

        System.out.print(val + " ");

      }

    }
  }


