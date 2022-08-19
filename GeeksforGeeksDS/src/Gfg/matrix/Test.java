package Gfg.matrix;

import java.util.ArrayList;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {

        ArrayList<Positions> list = new ArrayList<>();
        list.add(new Positions(1,2));
        list.add(new Positions(1,6));
        list.add(new Positions(1,1));
        System.out.println(list.contains(new Positions(1,10)));

        Positions thirdPositions = new Positions(1,4);
        Positions fourthPositions = new Positions(1,5);
        System.out.println(thirdPositions.equals(fourthPositions));

    }


}
class Positions {

    int x ;
    int y ;

    public Positions(int x, int y){
        this.x=x ;
        this.y=y ;
    }

    @Override
    public boolean equals(Object o) {

        Positions positions = (Positions) o;
        return this.x == positions.x &&
                this.y == positions.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}