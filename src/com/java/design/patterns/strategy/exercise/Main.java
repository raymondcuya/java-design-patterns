package com.java.design.patterns.strategy.exercise;

public class Main {

    public static void main(String[] args) {
        var chatClient = new ChatClient();
        chatClient.send("Hello world", new AES());
        chatClient.send("Hello world", new DES());
    }
}
