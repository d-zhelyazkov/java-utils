package com.xrc.lang;

public class Math {
    public static int dir(double number) {
        return (number == 0) ? 0 : (int) (number / java.lang.Math.abs(number));
    }

    public static long factorial(int number) {
        long result = 1;
        for (int i = 2; i <= number; i++)
            result *= i;
        return result;
    }
}
