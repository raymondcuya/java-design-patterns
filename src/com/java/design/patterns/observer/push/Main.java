package com.java.design.patterns.observer.push;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var sheet1 = new Spreadsheet();
        var sheet2 = new Spreadsheet();
        var chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
