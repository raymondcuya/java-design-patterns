package com.java.design.patterns.template;

import com.java.design.patterns.template.pattern.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        var task = new TransferMoneyTask();
        task.execute();
    }
}
