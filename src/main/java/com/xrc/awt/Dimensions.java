package com.xrc.awt;

import java.util.Comparator;

public class Dimensions {
    public static int compare(Dimension d1, Dimension d2) {

        Comparator<Dimension> comparator = new DimensionByAreaComparator();
        return comparator.compare(d1, d2);
    }
}
