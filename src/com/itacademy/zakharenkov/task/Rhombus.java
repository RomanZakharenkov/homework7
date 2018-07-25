package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 26.07.2018.
 */
public class Rhombus extends Quadrangle {

    public Rhombus(Point topLeft, Point topRight, Point bottomRight, Point bottomLeft) {
        super(topLeft, topRight, bottomRight, bottomLeft);
    }

    @Override
    public double square() {
        return (topLeft.distance(bottomRight) * topRight.distance(bottomLeft)) / 2;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
