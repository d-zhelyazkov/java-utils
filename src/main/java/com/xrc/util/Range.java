package com.xrc.util;

public class Range<T extends Comparable<T>> {

    private final T lowerBound;
    private final T higherBound;


    public Range(T lowerBound, T higherBound) {
        this.lowerBound = lowerBound;
        this.higherBound = higherBound;
    }

    public boolean isInRange(T value) {
        return ((lowerBound.compareTo(value) <= 0)
                && (value.compareTo(higherBound) <= 0));
    }

    public T getLowerBound() {
        return lowerBound;
    }

    public T getHigherBound() {
        return higherBound;
    }

    @Override
    public String toString() {
        return String.format("[%s:%s]", lowerBound, higherBound);
    }
}
