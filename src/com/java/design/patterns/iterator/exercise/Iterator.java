package com.java.design.patterns.iterator.exercise;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
