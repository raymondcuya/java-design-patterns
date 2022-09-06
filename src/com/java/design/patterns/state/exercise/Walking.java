package com.java.design.patterns.state.exercise;

public class Walking implements TravelMode{
    @Override
    public Object eta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public Object direction() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }
}
