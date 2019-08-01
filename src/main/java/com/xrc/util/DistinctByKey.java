package com.xrc.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class DistinctByKey<T> implements Predicate<T> {
    private final Map<Object, Boolean> seen = new ConcurrentHashMap<>();

    private final Function<T, Object> keyExtractor;

    public DistinctByKey(Function<T, Object> keyExtractor) {
        this.keyExtractor = keyExtractor;
    }

    @Override
    public boolean test(T object) {
        Object key = keyExtractor.apply(object);
        Boolean currentValue = seen.putIfAbsent(key, Boolean.TRUE);
        return (currentValue == null);
    }
}
