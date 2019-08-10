package com.xrc.lang;

import java.util.Comparator;

public class Numbers {

    public static <T extends Number> Comparator<T> getComparatorWithError(T maxError) {
        return (T number1, T number2) -> {
            double num1Double = number1.doubleValue();
            double num2Double = number2.doubleValue();

            double diff = num1Double - num2Double;

            if (java.lang.Math.abs(diff) <= maxError.doubleValue()) {
                return 0;
            }

            return Math.dir(diff);
        };
    }
}
