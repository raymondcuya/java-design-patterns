package com.java.design.patterns.adapter.exercise;

import com.java.design.patterns.adapter.exercise.gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient client = new GmailClient();

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}
