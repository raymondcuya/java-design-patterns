package com.java.design.patterns.state.exercise;

public class Transit implements TravelMode {
    @Override
    public Object eta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }

    @Override
    public Object direction() {
        System.out.println("Calculating Direction (transit)");
        return 3;
    }
}
