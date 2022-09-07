package com.java.design.patterns.state.exercise;

public class Main {
    public static void main(String[] args) {
        var directionService = new DirectionService();

        directionService.eta();
        directionService.direction();

        directionService.setTravelMode(new Transit());
        directionService.eta();
        directionService.direction();

        directionService.setTravelMode(new Bicycling());
        directionService.eta();
        directionService.direction();

        directionService.setTravelMode(new Driving());
        directionService.eta();
        directionService.direction();

    }

}
