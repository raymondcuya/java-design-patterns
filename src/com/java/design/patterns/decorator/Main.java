package com.java.design.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        var cloudStream = new EncryptedCloudStream();
        cloudStream.write("Here's my data");
    }
}
