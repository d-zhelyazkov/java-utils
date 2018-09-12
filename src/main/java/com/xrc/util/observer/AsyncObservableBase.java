package com.xrc.util.observer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public abstract class AsyncObservableBase<T extends Observer> extends ObservableBase<T> {

    private final ExecutorService executor = Executors.newSingleThreadExecutor();

    @Override
    public void notifyObservers(Consumer<T> notifyTask) {
        observers.forEach(o -> executor.submit(() -> notifyTask.accept(o)));
    }
}
