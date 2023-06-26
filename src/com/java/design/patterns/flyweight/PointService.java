package com.java.design.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }

    private PointIconFactory iconFactory;
    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        var point = new Point(1,2, iconFactory.getPointIcon(PointType.CAFE));
        points.add(point);

        return points;
    }
}
