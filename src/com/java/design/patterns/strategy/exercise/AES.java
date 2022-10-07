package com.java.design.patterns.strategy.exercise;

public class AES implements EncryptedAlgorithm {
    @Override
    public String encrypt(String message) {
        System.out.println("AES Encryption");
        return "AES Encypted Message";
    }
}
