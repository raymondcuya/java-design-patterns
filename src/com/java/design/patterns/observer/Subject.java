package com.java.design.patterns.observer;

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

    public void notifiyObservers() {
        for (var observer: observers)
            observer.update();
    }
}
