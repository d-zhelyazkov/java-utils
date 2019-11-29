package com.xrc.awt;

import java.util.Comparator;

public class DimensionByAreaComparator implements Comparator<Dimension> {
    @Override
    public int compare(Dimension d1, Dimension d2) {
        int d1Area = d1.width * d1.height;
        int d2Area = d2.width * d2.height;
        return Integer.compare(d1Area, d2Area);
    }
}
