package com.xrc.util.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomEnumSupplier<E extends Enum<E>> implements Supplier<E> {

    private final Random random = new Random();

    private final List<E> enums;

    public RandomEnumSupplier(Class<E> enumClass, boolean includeNull) {
        enums = new ArrayList<>(Arrays.asList(enumClass.getEnumConstants()));
        if (includeNull) {
            enums.add(null);
        }
    }

    public RandomEnumSupplier(Class<E> enumClass) {
        this(enumClass, false);
    }

    @Override
    public E get() {
        return enums.get(random.nextInt(enums.size()));
    }
}
