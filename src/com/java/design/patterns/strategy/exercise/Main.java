package com.java.design.patterns.strategy.exercise;

public class Main {

    public static void main(String[] args) {
        var chatClient = new ChatClient(new AES());
        chatClient.send("Hello world");

        chatClient = new ChatClient(new DES());
        chatClient.send("Hello world");
    }
}
