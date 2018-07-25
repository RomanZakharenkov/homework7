package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 25.07.2018.
 */
public class Quadrate extends Quadrangle {

    public Quadrate(Point topLeft, Point topRight, Point bottomRight, Point bottomLeft) {
        super(topLeft, topRight, bottomRight, bottomLeft);
    }

    public Quadrate(Point topLeft, Point bottomRight) {
        super(topLeft, new Point(bottomRight.getX(), topLeft.getY()), bottomRight, new Point(topLeft.getX(), bottomRight.getY()));
    }

    @Override
    public double square() {
        return topLeft.distance(topRight) * topLeft.distance(topRight);
    }

    @Override
    public String toString() {
        return "Quadrate{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
