package com.cursor.hw.hw3.problem1.shape.planeShape.Shapes2D;

import com.cursor.hw.hw3.problem1.shape.planeShape.PlaneShape;
import com.cursor.hw.hw3.problem1.vertex.Vertex2D;

public class Triangle extends PlaneShape {

    private final Vertex2D a;
    private final Vertex2D b;
    private final Vertex2D c;
    private final double ab;
    private final double bc;
    private final double ca;

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ab = a.distanceVertex(b);
        bc = b.distanceVertex(c);
        ca = c.distanceVertex(a);
    }


    @Override
    public double getArea() {
        double s;
        s = getPerimeter() / 2;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));
    }

    @Override
    public double getPerimeter() {
        return ab + bc + ca;
    }

    @Override
    public String toString() {
        return "Triengle, " +
                "Vertex Coordinate: A=(" + a.toString() +
                "), B=(" + b.toString() +
                "), C=(" + c.toString() +
                ") Perimeter=" + getPerimeter() +
                ", Area=" + getArea();
    }
}
