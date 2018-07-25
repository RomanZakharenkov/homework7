package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 26.07.2018.
 */
public class ShapeUtils {

    public static boolean isRectangle(Shape shape) {
        return shape instanceof Rectangle;
    }

    public static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }
}
