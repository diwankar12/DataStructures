package Gfg.Sorting.Arrays;

import java.util.Comparator;

public class ComparatorObj implements Comparator<Points> {
    @Override
    public int compare(Points o1, Points o2) {
        return o1.getX() - o2.getX();
    }
}
