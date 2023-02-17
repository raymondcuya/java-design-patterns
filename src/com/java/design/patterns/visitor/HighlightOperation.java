package com.java.design.patterns.visitor;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("hightlight-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("hightlight-anchor");
    }
}
