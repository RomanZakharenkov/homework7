package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 25.07.2018.
 */
public abstract class Ring implements Shape {

    protected Point center;

    public Ring(Point center) {
        this.center = center;
    }
}
