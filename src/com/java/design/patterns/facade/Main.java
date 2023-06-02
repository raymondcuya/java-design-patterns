package com.java.design.patterns.facade;

public class Main {
    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("appId", "key");
        var message = new Message("hello world");
        server.send(authToken, message, "target");
        connection.disconnect();
    }
}
