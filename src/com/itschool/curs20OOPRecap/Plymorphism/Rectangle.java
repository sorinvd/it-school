package com.itschool.curs20OOPRecap.Plymorphism;

public class Rectangle extends Shape {

    int length;
    int width;

    @Override
    public int CalculateArea() {
        return length * width;
    }

    public Rectangle(int givenLength, int givenWidth){
        this.length = givenLength;
        this.width = givenWidth;
        super.name = "Rectangle";
    }
}
