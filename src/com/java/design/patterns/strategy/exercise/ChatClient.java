package com.java.design.patterns.strategy.exercise;

public class ChatClient {
    private EncryptedAlgorithm algorithm;

    public ChatClient(EncryptedAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void send(String message) {
        var encryptedMessage = algorithm.encrypt(message);
        System.out.println("Sending the encrypted message... " + encryptedMessage);
    }
}
