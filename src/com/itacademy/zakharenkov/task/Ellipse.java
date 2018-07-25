package com.itacademy.zakharenkov.task;


/**
 * Created by Рома on 25.07.2018.
 */
public class Ellipse extends Ring {

    private double smallRadius;
    private double bigRadius;

    public Ellipse(Point center, double smallRadius, double bigRadius) {
        super(center);
        this.smallRadius = smallRadius;
        this.bigRadius = bigRadius;
    }

    @Override
    public double square() {
        return Math.PI * smallRadius * bigRadius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((smallRadius * smallRadius + bigRadius * bigRadius) / 2);
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "center=" + center +
                ", smallRadius=" + smallRadius +
                ", bigRadius=" + bigRadius +
                "} ";
    }
}
