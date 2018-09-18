package com.xrc.util.function;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Generates random floats with absolute value < {@code max}
 */
public class RandomFloatsSupplier implements Supplier<Float> {

    private final Random random = new Random();

    private final float max;

    public RandomFloatsSupplier(float max) {
        this.max = max;
    }

    @Override
    public Float get() {
        float randomFloat = random.nextFloat();         //[0;1]
        randomFloat -= 0.5f;                            //[-0.5;0.5]
        randomFloat *= 2;                               //[-1;1]
        randomFloat *= max;                             //[-max;max]
        return randomFloat;
    }
}