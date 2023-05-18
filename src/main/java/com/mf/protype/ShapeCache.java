package com.mf.protype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String, CloneableShape> shapeCache = new HashMap<>();

    public static CloneableShape getShape(String shapeId) {
        CloneableShape cachedShape = shapeCache.get(shapeId);
        return cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle(5);
        shapeCache.put("Circle", circle);

        Rectangle rectangle = new Rectangle(10, 15);
        shapeCache.put("Rectangle", rectangle);
    }
}
