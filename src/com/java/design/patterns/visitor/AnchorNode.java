package com.java.design.patterns.visitor;

public class AnchorNode implements HtmlNode {
    @Override
    public void highlight() {
        System.out.println("hightlight-anchor");
    }
}
