package com.itacademy.zakharenkov.task;

/**
 * Created by Рома on 25.07.2018.
 */
public class Task {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(4.0, 4.0), 3.0);
        System.out.println(circle.toString());
        System.out.println("Square of circle: " + circle.square());
        System.out.println("Circumference of circle: " + circle.perimeter());

        Ellipse ellipse = new Ellipse(new Point(5.0, 5.0), 4.0, 3.0);
        System.out.println(ellipse.toString());
        System.out.println("Square of ellipse: " + ellipse.square());
        System.out.println("Circumference of ellipse: " + ellipse.perimeter());

        Triangle triangle = new Triangle(new Point(0.0, 0.0), new Point(2.0, 4.0), new Point(5.0, 1.0));
        System.out.println(triangle.toString());
        System.out.println("Square of triangle: " + triangle.square());
        System.out.println("Perimeter of triangle: " + triangle.perimeter());
        System.out.println("Height of triangle: " + triangle.calculateHeight());

        Quadrate quadrate = new Quadrate(new Point(1.0, 5.0), new Point(5.0, 1.0));
        System.out.println(quadrate.toString());
        System.out.println("Square of quadrate: " + quadrate.square());
        System.out.println("Perimeter of quadrate: " + quadrate.perimeter());

        Rectangle rectangle = new Rectangle(new Point(1.0, 5.0), new Point(4.0, 1.0));
        System.out.println(rectangle.toString());
        System.out.println("Square of rectangle: " + rectangle.square());
        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("Diagonal of rectangle" + rectangle.calculateDiagonal());

        Rhombus rhombus = new Rhombus(new Point(0.0, 3.0), new Point(2.0, 6.0), new Point(4.0, 3.0), new Point(2.0, 0.0));
        System.out.println(rhombus.toString());
        System.out.println("Square of rhombus: " + rhombus.square());
        System.out.println("Perimeter of rhombus: " + rhombus.perimeter());

        System.out.println("Is quadrate square equal to circle square: " + quadrate.isEqualsSquare(circle));
        System.out.println("Is rhombus square equal to rectangle square: " + rhombus.isEqualsSquare(rectangle));

        System.out.println(ShapeUtils.isRectangle(quadrate));
        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println(ShapeUtils.isTriangle(circle));
        System.out.println(ShapeUtils.isTriangle(triangle));
    }
}
