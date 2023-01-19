package com.java.design.patterns.chainOfResponsibility;

public class HttpRequest {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String username;
    private String password;

    public HttpRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
