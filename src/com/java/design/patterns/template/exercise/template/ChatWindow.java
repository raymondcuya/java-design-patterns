package com.java.design.patterns.template.exercise.template;

public class ChatWindow extends Window{
    @Override
    protected void preClosing() {
        System.out.println("Pre closing chat window");
    }

    @Override
    protected void postClosing() {
        System.out.println("Post closing chat window");
    }
}
