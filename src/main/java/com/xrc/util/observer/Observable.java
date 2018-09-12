package com.xrc.util.observer;

import java.util.function.Consumer;

public interface Observable<T extends Observer> {

    void subscribe(T observer);

    void unsubscribe(T observer);

    void notifyObservers();

    void notifyObservers(Consumer<T> notifyTask);
}
