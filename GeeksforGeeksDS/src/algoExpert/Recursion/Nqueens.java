package algoExpert.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {


    public static void main(String[] args) {

        System.out.println(nonAttackingQueens(4));
    }
    public static int nonAttackingQueens(int n) {
        // Write your code here.
        int[][] board = new int[n][n];
        List<Integer> list = new ArrayList<>();
        nonAttackingQueensRec(0,board,n,list);
        return list.size();
    }

    private static void nonAttackingQueensRec(int col,int[][] board,int n,List<Integer> list ){
        if(col==board.length){
            list.add(1); ;
            return ;
        }

        for(int row=0;row<n;row++){

            if(isSafe(row,col,board)){
                board[row][col] = 1;
                nonAttackingQueensRec(col+1,board,n,list);
                board[row][col] = 0 ;
            }

        }
    }


    private static boolean isSafe(int row,int col,int[][] board){
        //check upward dioginally
        int duprow = row;
        int dupcol = col;
        while(row >= 0 && col >= 0) {
            if(board[row][col] == 1) return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while(col >= 0) {
            if(board[row][col] == 1) return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while(col >= 0 && row < board.length) {
            if(board[row][col] == 1) return false;
            col--;
            row++;
        }
        return true;
    }




}
