package com.xrc.util.function;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplierComposite<T> implements Supplier<T> {

    private final Random random = new Random();

    private final List<Supplier<T>> suppliers;

    @SafeVarargs
    public RandomSupplierComposite(Supplier<T>... suppliers) {
        this.suppliers = Arrays.asList(suppliers);
    }

    @Override
    public T get() {
        int supplierIx = random.nextInt(suppliers.size());
        return suppliers.get(supplierIx).get();
    }
}
