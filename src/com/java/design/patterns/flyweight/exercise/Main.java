package com.java.design.patterns.flyweight.exercise;

public class Main {
    public static void main(String[] args) {
        var sheet = new SpreadSheet();
        sheet.setContent(0, 0, "Hello");
        sheet.setContent(1, 0, "World");
        sheet.setFontFamily(0, 0, "Arial");
        sheet.render();
    }
}
