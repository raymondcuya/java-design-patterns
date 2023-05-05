package com.java.design.patterns.decorator;

public class CompressedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        var compressed = compress(data);
        super.write(data);
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
