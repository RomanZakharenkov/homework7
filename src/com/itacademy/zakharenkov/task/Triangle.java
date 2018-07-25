package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 26.07.2018.
 */
public class Triangle implements Shape {

    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public double calculateHeight() {
        return 2 * square() / firstPoint.distance(secondPoint);
    }

    @Override
    public double square() {
        double semiPerimeter = perimeter() / 2;
        return Math.sqrt(semiPerimeter *
                (semiPerimeter - firstPoint.distance(secondPoint)) *
                (semiPerimeter - secondPoint.distance(thirdPoint)) *
                (semiPerimeter - thirdPoint.distance(firstPoint)));
    }

    @Override
    public double perimeter() {
        return firstPoint.distance(secondPoint) + secondPoint.distance(thirdPoint) + thirdPoint.distance(firstPoint);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                '}';
    }
}
