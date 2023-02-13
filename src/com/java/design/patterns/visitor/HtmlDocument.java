package com.java.design.patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void hightlight() {
        for (var node: nodes) {
            node.highlight();
        }
    }
}
