package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 25.07.2018.
 */
public class Circle extends Ring {

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                "}";
    }
}
