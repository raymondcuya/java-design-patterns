package com.java.design.patterns.mediator.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();
    public void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }
    protected void notifyEventHandlers() {
        for (var eventHandler: eventHandlers) {
            eventHandler.handle();
        }
    }
}
