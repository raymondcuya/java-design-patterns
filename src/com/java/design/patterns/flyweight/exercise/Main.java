package com.java.design.patterns.flyweight.exercise;

public class Main {
    public static void main(String[] args) {
        var contextFactory = new CellContextFactory();
        var sheet = new SpreadSheet(contextFactory);
        sheet.setContent(0, 0, "Hello");
        sheet.setContent(1, 0, "World");
        sheet.setFontFamily(0, 0, "Arial");
        sheet.render();
    }
}
