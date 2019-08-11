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
}
