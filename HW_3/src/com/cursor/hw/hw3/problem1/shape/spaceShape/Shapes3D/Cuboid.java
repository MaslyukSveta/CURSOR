package com.cursor.hw.hw3.problem1.shape.spaceShape.Shapes3D;

import com.cursor.hw.hw3.problem1.shape.spaceShape.SpaceShape;
import com.cursor.hw.hw3.problem1.vertex.Vertex3D;

public class Cuboid extends SpaceShape {

    private final Vertex3D a;
    private final double width;
    private final double height;
    private final double depth;

    public Cuboid(Vertex3D a, double width, double height, double depth) {
        this.a = a;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + height * depth + depth * width);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid, " +
                "Vertex Coordinate: A=(" + a.toString() +
                "), Width=" + width +
                ", Height=" + height +
                ", Depth=" + depth +
                ", Volume=" + getVolume() +
                ", Area=" + getArea();
    }
}
