package com.java.design.patterns.bridge;

public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControl(new SonyTV());
        remoteControl.turnOn();
        var advancedRemoteControl = new AdvancedRemoteControl(new SonyTV());
        advancedRemoteControl.turnOn();

        var samsungRC = new RemoteControl(new SamsungTV());
        samsungRC.turnOn();

    }
}
