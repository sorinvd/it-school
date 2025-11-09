package com.itschool.curs20OOPRecap.Plymorphism;

public class Circle extends Shape {
    int radius;


    @Override
    public int CalculateArea() {
        return (int)(radius *radius * 3.14);
    }

    public Circle(int givenRadius) {
        this.radius = givenRadius;
        super.name = "Circle";
    }
}
