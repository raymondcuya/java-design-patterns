package com.java.design.patterns.template.exercise.template;

public abstract class Window {
    public void close() {
        preClosing();
        System.out.println("Removing the window from the screen");
        postClosing();
    }

    protected abstract void preClosing();
    protected abstract void postClosing();
}
