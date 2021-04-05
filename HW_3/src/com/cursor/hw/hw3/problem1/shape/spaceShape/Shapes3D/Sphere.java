package com.cursor.hw.hw3.problem1.shape.spaceShape.Shapes3D;

import com.cursor.hw.hw3.problem1.shape.spaceShape.SpaceShape;
import com.cursor.hw.hw3.problem1.vertex.Vertex3D;

public class Sphere extends SpaceShape {
    private final Vertex3D a;
    private final double radius;

    public Sphere(Vertex3D a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4 * Math.PI * radius * radius * radius / 3;
    }

    @Override
    public String toString() {
        return "Sphere, " +
                "Vertex Coordinate: A=(" + a.toString() +
                "), Radius=" + radius +
                ", Volume=" + getVolume() + ", Area=" + getArea();
    }
}
