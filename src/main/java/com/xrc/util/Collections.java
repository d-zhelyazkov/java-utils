package com.xrc.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Collections {

    public static <T> T getRandomElement(Collection<T> elements) {
        int elemIx = new Random().nextInt(elements.size());
        Iterator<T> iterator = elements.iterator();
        while ((elemIx--) > 0) {
            iterator.next();
        }

        return iterator.next();
    }

    public static <T> T getRandomElement(List<T> elements) {
        return elements.get(new Random().nextInt(elements.size()));
    }

    public static <T> Set<T> symmetricDifference(Collection<T> collection1, Collection<T> collection2) {
        Set<T> result = new HashSet<>(collection1.size() + collection2.size());
        result.addAll(collection1);
        for (T element : collection2) {
            if (result.contains(element)) {
                result.remove(element);
            } else {
                result.add(element);
            }
        }
        return result;
    }

    public static <T> boolean isOrdered(List<T> list, java.util.Comparator<T> comparator) {

        int elements = list.size();
        if (elements <= 1) {
            return true;
        }

        Comparator<T> exComparator = new Comparator<>(comparator);
        for (int i = 0; i < elements - 1; i++) {
            if (exComparator.greater(list.get(i), list.get(i + 1)))
                return false;
        }

        return true;
    }

    public static <T extends Comparable<? super T>> boolean isOrdered(List<T> list) {
        return isOrdered(list, java.util.Comparator.naturalOrder());
    }

}
