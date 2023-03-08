package com.java.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Object> shapes = new ArrayList<>();
    public void add(Object shape) {
        shapes.add(shape);
    }

    public void render() {
        for (var object: shapes)
            if (object instanceof Shape)
                ((Shape) object).render();
            else
                ((Group)object).render();
    }
}
