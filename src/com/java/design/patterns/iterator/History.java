package com.java.design.patterns.iterator;

public interface History<T> {
    void push(T url);
    T pop();

    Iterator<T> createIterator();
}
