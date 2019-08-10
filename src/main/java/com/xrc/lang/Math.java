package com.xrc.lang;

public class Math {
    public static int dir(Number number) {
        double numberDouble = number.doubleValue();
        return (numberDouble == 0) ? 0 : (int) (numberDouble / java.lang.Math.abs(numberDouble));
    }

    public static long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++)
            result *= i;
        return result;
    }
}
