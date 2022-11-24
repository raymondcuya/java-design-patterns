package com.java.design.patterns.observer;

public class Spreadsheet implements Observer{
    @Override
    public void update() {
        System.out.println("Spreadsheet got notified.");
    }
}
