package com.java.design.patterns.chainOfResponsibility.exercise;

public class DataReadFactory {
    public static DataReader getDataReaderChain() {
        var excelReader = new ExcelReader();
        var numbersReader = new NumbersReader();
        var quickBooksReaader = new QuickBooksReader();

        quickBooksReaader.setNext(numbersReader);
        numbersReader.setNext(excelReader);

        return quickBooksReaader;
    }
}
