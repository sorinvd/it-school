package com.itschool.curs20OOPRecap.Inheritance;

public class Dog extends Animal{
    String breed;
    int size;

    public void bark()
    {
        System.out.println("My breed is " + breed);
    }

    public void fetch(int givenSize)
    {
        this.size = givenSize;
        System.out.println("I fetched a ball of size "+ givenSize);
    }

}
