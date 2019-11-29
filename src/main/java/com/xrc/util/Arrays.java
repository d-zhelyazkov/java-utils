package com.xrc.util;

import com.xrc.awt.geom.Point2D;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class Arrays {

    public static int[][] clone2DArray(int[][] array) {
        int[][] clone = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, clone[i], 0, array[i].length);
        }

        return clone;
    }

    public static <T> void swapIn2DArray(T[][] array, Point2D el1, Point2D el2) {
        T buf = array[(int) el1.getY()][(int) el1.getX()];
        array[(int) el1.getY()][(int) el1.getX()] = array[(int) el2.getY()][(int) el2.getX()];
        array[(int) el2.getY()][(int) el2.getX()] = buf;
    }

    public static void swapIn2DArray(int[][] array, Point2D el1, Point2D el2) {
        int buf = array[(int) el1.getY()][(int) el1.getX()];
        array[(int) el1.getY()][(int) el1.getX()] = array[(int) el2.getY()][(int) el2.getX()];
        array[(int) el2.getY()][(int) el2.getX()] = buf;
    }

    @SafeVarargs
    public static <T> Set<T> asSet(T... array) {
        return new HashSet<>(java.util.Arrays.asList(array));
    }

    public static <T> T max(T[] array, Comparator<T> comparator) {
        Collection<T> list = java.util.Arrays.asList(array);
        return java.util.Collections.max(list, comparator);
    }

    public static boolean isEmpty(int[] array) {
        return ((array == null) || (array.length == 0));
    }

    public static boolean contains(int[] arr, int value) {
        return java.util.Arrays.stream(arr)
                .anyMatch(i -> (i == value));
    }

    public static <T> T find(T[] arr, Predicate<T> predicate) {
        Optional<T> result = java.util.Arrays.stream(arr)
                .filter(predicate)
                .findAny();

        return result.orElse(null);
    }
}
