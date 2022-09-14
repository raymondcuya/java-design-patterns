package com.java.design.patterns.iterator;

public class BrowseHistoryArray implements History<String>{
    private String[] urls = new String[10];
    private int count;


    @Override
    public void push(String url) {
        urls[count++] = url;
    }

    @Override
    public String pop() {
        return urls[--count];
    }

    @Override
    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {
        private BrowseHistoryArray history;
        private int index;


        public ArrayIterator(History<String> history) {
            this.history = (BrowseHistoryArray) history;
        }

        @Override
        public boolean hasNext() {
            return index < history.count;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
