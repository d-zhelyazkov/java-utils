package com.xrc.lang;

public class Integers {

    public static boolean equal(int a, Integer b) {
        if (b == null)
            return false;

        return (a == b);
    }

    public static boolean equal(Integer a, int b) {
        return equal(b, a);
    }

    public static boolean isPowerOfTwo(int num) {
        return ((num != 0) &&
                ((num & (num - 1)) == 0));
    }
}
