package com.xrc.util;

import java.util.Comparator;

public class ComparatorDecorator<T> implements Comparator<T> {

    private final Comparator<T> decoratedComparator;

    public ComparatorDecorator(Comparator<T> decoratedComparator) {
        this.decoratedComparator = decoratedComparator;
    }

    @Override
    public int compare(T o1, T o2) {
        return decoratedComparator.compare(o1, o2);
    }
}
