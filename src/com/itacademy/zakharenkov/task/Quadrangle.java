package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 25.07.2018.
 */
public abstract class Quadrangle implements Shape {

    protected Point topLeft;
    protected Point topRight;
    protected Point bottomLeft;
    protected Point bottomRight;

    public Quadrangle(Point topLeft, Point topRight, Point bottomRight, Point bottomLeft) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double perimeter() {
        return 2 * (topLeft.distance(topRight) + topLeft.distance(bottomLeft));
    }
}
