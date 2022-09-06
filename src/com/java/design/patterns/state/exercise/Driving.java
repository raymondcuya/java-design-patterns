package com.java.design.patterns.state.exercise;

public class Driving implements TravelMode{
    @Override
    public Object eta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public Object direction() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
