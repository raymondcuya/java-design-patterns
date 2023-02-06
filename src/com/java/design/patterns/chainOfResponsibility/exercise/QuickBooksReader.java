package com.java.design.patterns.chainOfResponsibility.exercise;

public class QuickBooksReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a Quickbooks file.");
    }
}
