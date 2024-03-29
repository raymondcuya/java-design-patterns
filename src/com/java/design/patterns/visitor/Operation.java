package com.java.design.patterns.visitor;

public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
