package com.java.design.patterns.strategy.exercise;

public class ChatClient {
    public void send(String message, EncryptedAlgorithm algorithm) {
        var encryptedMessage = algorithm.encrypt(message);
        System.out.println("Sending the encrypted message... " + encryptedMessage);
    }
}
