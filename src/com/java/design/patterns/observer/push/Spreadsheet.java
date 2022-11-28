package com.java.design.patterns.observer.push;

public class Spreadsheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet got notified: " + value);
    }
}
