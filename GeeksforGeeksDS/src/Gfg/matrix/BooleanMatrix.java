package Gfg.matrix;


import java.util.ArrayList;
import java.util.Objects;

class BooleanMatrix
{


    public static void main(String[] args) {


       int matrix[][] = {{ 1, 0, 0},
            { 1, 0, 0},
            { 1, 0, 0},
            { 0, 0, 0}};

        BooleanMatrix booleanMatrix = new BooleanMatrix();
        booleanMatrix.booleanMatrix(matrix);

    }


    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void  booleanMatrix(int matrix[][])
    {

        ArrayList<Position> list = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){

                if(matrix[i][j]==1 && !list.contains(new Position(i,j))){

                    for(int k=0;k<matrix[0].length;k++){
                        if(matrix[i][k]==0){
                            list.add(new Position(i,k)) ;
                        }
                        matrix[i][k] = 1 ;

                    }

                    for(int k=0;k<matrix.length;k++){
                        if(matrix[k][j]==0){
                            list.add(new Position(k,j)) ;
                        }
                        matrix[k][j] = 1 ;
                    }

                }


            }



        }


    }
}

class Position {

    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {

        Position position = (Position) o;
        return this.x == position.x &&
                this.y == position.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}