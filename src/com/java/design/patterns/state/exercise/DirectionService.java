package com.java.design.patterns.state.exercise;

public class DirectionService {
    private TravelMode travelMode = new Walking();

    public Object eta() {
        return travelMode.eta();
    }

    public Object direction() {
        return travelMode.direction();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}

