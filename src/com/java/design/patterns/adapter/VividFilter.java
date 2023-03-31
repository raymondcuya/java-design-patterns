package com.java.design.patterns.adapter;

public class VividFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("Applying Vivid Filter");
    }
}
