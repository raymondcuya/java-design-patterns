package com.java.design.patterns.state.exercise;

public class Bicycling implements TravelMode{
    @Override
    public Object eta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object direction() {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
