package com.java.design.patterns.memento;

public class Editor {
    public String getContent() {
        return content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
}
