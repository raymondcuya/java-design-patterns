package com.java.design.patterns.exercise.memento;

public class DocumentMemento {
    private final String content;
    private final String fontName;
    private final int fontSize;

    public DocumentMemento(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }
}
