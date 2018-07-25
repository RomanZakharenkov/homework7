package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 25.07.2018.
 */
public class Rectangle extends Quadrangle {

    public Rectangle(Point topLeft, Point topRight, Point bottomRight, Point bottomLeft) {
        super(topLeft, topRight, bottomRight, bottomLeft);
    }

    public Rectangle(Point topLeft, Point bottomRight) {
        super(topLeft, new Point(bottomRight.getX(), topLeft.getY()), bottomRight, new Point(topLeft.getX(), bottomRight.getY()));
    }

    public double calculateDiagonal() {
        return topLeft.distance(bottomRight);
    }

    @Override
    public double square() {
        return topLeft.distance(topRight) * topLeft.distance(bottomLeft);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
