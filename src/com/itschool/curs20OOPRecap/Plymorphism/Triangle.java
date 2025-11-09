package com.itschool.curs20OOPRecap.Plymorphism;

public class Triangle extends Shape{
    int baseLength;
    int heightLength;
    final String name = "Triangle";
    @Override
    public int CalculateArea() {
        return (int)(baseLength * heightLength / 2);
    }

    public Triangle(int givenBase, int givenHeight){
        this.baseLength = givenBase;
        this.heightLength = givenHeight;
        super.name = "Triangle";
    }
}
