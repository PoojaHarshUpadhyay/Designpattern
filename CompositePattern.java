package com.company;

import java.util.ArrayList;
import java.util.List;


abstract class Shape {
    abstract void draw(String value);
}

class Circle extends Shape {
    @Override
    void draw(String filColor) {
        System.out.println(String.format("This is Circle %s", filColor));
    }
}

class Square extends Shape {
    @Override
    void draw(String filColor) {
        System.out.println(String.format("This is Square %s", filColor));
    }
}

class Triangle extends Shape {
    @Override
    void draw(String filColor) {
        System.out.println(String.format("This is Triangle %s", filColor));
    }
}

class CompositeContainer extends Shape {
    private List<Shape> shapes = new ArrayList<Shape>();


    @Override
    void draw(String value) {
        for (Shape sh : shapes) {
            sh.draw(value);
        }
    }

    void add(Shape value) {
        shapes.add(value);
    }

    void remove(Shape value) {
        shapes.remove(value);
    }

    void clear() {
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // write your code here
        CompositeContainer compositeContainer = new CompositeContainer();

        Shape sCircle = new Circle();
        Shape sTriangle = new Triangle();
        Shape sSquare = new Square();

        compositeContainer.add(sCircle);
        compositeContainer.add(sTriangle);
        compositeContainer.add(sSquare);

        compositeContainer.draw("red");

        compositeContainer.clear();


        compositeContainer.add(sCircle);
        compositeContainer.add(sTriangle);
        compositeContainer.draw("blue");
    }
}
