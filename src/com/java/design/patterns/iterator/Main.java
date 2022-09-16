package com.java.design.patterns.iterator;

public class Main {
    public static void main(String[] args) {
        var history = (History) new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");
        history.pop();

        Iterator iterator = history.createIterator();
        while(iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

        history = (History) new BrowseHistoryArray();
        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");
        history.pop();

        iterator = history.createIterator();
        while(iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

    }
}
