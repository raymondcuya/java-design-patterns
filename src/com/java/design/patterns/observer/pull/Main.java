package com.java.design.patterns.observer.pull;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var sheet1 = new Spreadsheet(dataSource);
        var sheet2 = new Spreadsheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
