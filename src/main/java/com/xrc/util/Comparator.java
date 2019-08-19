package com.xrc.util;

public class Comparator<T> extends ComparatorDecorator<T> {

    public Comparator(java.util.Comparator<T> decoratedComparator) {
        super(decoratedComparator);
    }

    public boolean equal(T o1, T o2) {
        int comparisonResult = super.compare(o1, o2);
        return (comparisonResult == 0);
    }

    public boolean less(T o1, T o2) {
        int comparisonResult = super.compare(o1, o2);
        return (comparisonResult < 0);
    }

    public boolean lessOrEqual(T o1, T o2) {
        int comparisonResult = super.compare(o1, o2);
        return (comparisonResult <= 0);
    }

    public boolean greater(T o1, T o2) {
        int comparisonResult = super.compare(o1, o2);
        return (comparisonResult > 0);
    }

    public boolean greaterOrEqual(T o1, T o2) {
        int comparisonResult = super.compare(o1, o2);
        return (comparisonResult >= 0);
    }
}
