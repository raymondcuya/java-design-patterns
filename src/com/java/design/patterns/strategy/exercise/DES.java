package com.java.design.patterns.strategy.exercise;

public class DES implements EncryptedAlgorithm {

    @Override
    public String encrypt(String message) {
        System.out.println("DES Encryption");
        return "DES Encypted Message";
    }
}
