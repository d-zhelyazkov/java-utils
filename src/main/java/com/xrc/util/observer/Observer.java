package com.xrc.util.observer;

public interface Observer {

    /**
     * @param object the object that notifies this Observer
     */
    default void notify(Observable object) {
    }

}
