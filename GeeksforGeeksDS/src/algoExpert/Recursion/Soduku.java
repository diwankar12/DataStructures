package algoExpert.Recursion;

import java.util.ArrayList;

public class Soduku {

    public ArrayList<ArrayList<Integer>> solveSudoku(ArrayList<ArrayList<Integer>> board) {
        solve(board);
        return board;
    }

    public boolean solve(ArrayList<ArrayList<Integer>> board) {
        // Write your code here.
        // create isSafe function

        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.size(); j++) {
                if (board.get(i).get(j) == 0) {
                    for (int k = 1; k < 10; k++) {
                        if (isSafe(i, j, k, board)) {
                            board.get(i).set(j, k);
                            if (solve(board)) {
                                return true;
                            } else {
                                board.get(i).set(j, 0);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    public boolean isSafe(int row, int col, int num, ArrayList<ArrayList<Integer>> board) {

        // row
      for(int i=0;i<9;i++){
          if(board.get(i).get(col)==num) return false;
          if(board.get(row).get(i)==num) return false ;
          int subRowMatrix = 3* (row/3) + i/3 ;
          int subColMatrix = 3* (col/3) + i%3 ;
          if(board.get(subRowMatrix).get(subColMatrix)==num)return false ;
      }
        return true;
    }


}
