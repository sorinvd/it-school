package com.itschool.curs20OOPRecap.Plymorphism;

import java.net.SecureCacheResponse;

public class Main {

    public static void main(String[] args) {
        Circle circleInstance = new Circle(3);
        Rectangle rectangleInstance = new Rectangle(4,5);
        Triangle triangleInstance = new Triangle(7,11);

        Shape[] ArrayofShapes = {circleInstance, rectangleInstance, triangleInstance};
        int currentArea;

        for (Shape shapeIndex : ArrayofShapes){
            currentArea = shapeIndex.CalculateArea();
            System.out.println("Area of this " + shapeIndex.name + " is: " + currentArea);
        }
    }
}
