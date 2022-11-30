package com.java.design.patterns.observer.push;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public  void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifiyObservers(int value) {
        for (var observer: observers)
            observer.update(value);
    }
}
