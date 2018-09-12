package com.xrc.util.observer;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.function.Consumer;

public abstract class ObservableBase<T extends Observer> implements Observable<T> {

    protected final Collection<T> observers = new LinkedHashSet<>();

    @Override
    public void subscribe(T observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(T observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        notifyObservers(o -> o.notify(this));
    }

    @Override
    public void notifyObservers(Consumer<T> notifyTask) {
        observers.forEach(notifyTask);
    }

}
