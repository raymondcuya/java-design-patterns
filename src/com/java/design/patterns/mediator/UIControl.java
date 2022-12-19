package com.java.design.patterns.mediator;

public class UIControl {
    public UIControl(DialogBox owner) {
        this.owner = owner;
    }

    protected DialogBox owner;
}
