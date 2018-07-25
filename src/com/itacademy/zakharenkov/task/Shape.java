package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 25.07.2018.
 */
public interface Shape {

    double square();

    double perimeter();

    default boolean isEqualsSquare(Shape shape) {
        return this.square() == shape.square();
    }
}
