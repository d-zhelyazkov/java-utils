package com.xrc.lang;

public class Integer {

    public static boolean equal(int a, java.lang.Integer b) {
        if (b == null)
            return false;

        return (a == b);
    }

    public static boolean equal(java.lang.Integer a, int b) {
        return equal(b, a);
    }

}
