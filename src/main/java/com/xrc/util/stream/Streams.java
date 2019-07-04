package com.xrc.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Streams {

    public static <T> Stream<T> iterate(T seed, Predicate<T> condition, UnaryOperator<T> producer) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
                new Iterator<T>() {
                    private T next = seed;

                    @Override
                    public boolean hasNext() {
                        return condition.test(next);
                    }

                    @Override
                    public T next() {
                        T result = next;
                        next = producer.apply(next);
                        return result;
                    }
                },
                Spliterator.ORDERED | Spliterator.IMMUTABLE),
                false);

    }

}
