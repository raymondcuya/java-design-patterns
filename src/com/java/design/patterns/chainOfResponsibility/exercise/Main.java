package com.java.design.patterns.chainOfResponsibility.exercise;

public class Main {
    public static void main(String[] args) {
        var reader = DataReadFactory.getDataReaderChain();
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
        reader.read("data.jpg");
    }
}
