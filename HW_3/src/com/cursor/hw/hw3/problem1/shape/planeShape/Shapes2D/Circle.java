package com.cursor.hw.hw3.problem1.shape.planeShape.Shapes2D;

import com.cursor.hw.hw3.problem1.shape.planeShape.PlaneShape;
import com.cursor.hw.hw3.problem1.vertex.Vertex2D;

public class Circle extends PlaneShape {

    private final Vertex2D a;
    private final double radius;


    public Circle(Vertex2D a, double radius) {
        this.a = a;
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle, " +
                "Vertex Coordinate: A=(" + a.toString() +
                "), Radius=" + radius +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea();
    }
}
