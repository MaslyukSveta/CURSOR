package com.cursor.hw.hw3.problem1;

import com.cursor.hw.hw3.problem1.shape.Shape;
import com.cursor.hw.hw3.problem1.shape.planeShape.Shapes2D.Circle;
import com.cursor.hw.hw3.problem1.shape.planeShape.Shapes2D.Rectangle;
import com.cursor.hw.hw3.problem1.shape.planeShape.Shapes2D.Triangle;
import com.cursor.hw.hw3.problem1.shape.spaceShape.Shapes3D.Cuboid;
import com.cursor.hw.hw3.problem1.shape.spaceShape.Shapes3D.Sphere;
import com.cursor.hw.hw3.problem1.shape.spaceShape.Shapes3D.SquarePyramid;
import com.cursor.hw.hw3.problem1.vertex.Vertex2D;
import com.cursor.hw.hw3.problem1.vertex.Vertex3D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(new Vertex2D(8, 4), 9);
        Shape circle2 = new Circle(new Vertex2D(6, 7), 8);
        Shape circle3 = new Circle(new Vertex2D(3, 2), 5);
        Shape rectangle = new Rectangle(new Vertex2D(5, 5), 10, 15);
        Shape triangle = new Triangle(new Vertex2D(2, 3), new Vertex2D(5, 4), new Vertex2D(8, 6));
        Shape cuboid = new Cuboid(new Vertex3D(0, 0, 0), 10, 20, 30);
        Shape sphere = new Sphere(new Vertex3D(1, 1, 1), 10);
        Shape squarePyramid = new SquarePyramid(new Vertex3D(4, 4, 4), 4, 4);


        Shape[] shapes = {circle1, circle2, circle3, rectangle, triangle, cuboid, sphere, squarePyramid};

        Arrays.stream(shapes).map(Object::toString).forEach(System.out::println);
    }
}
