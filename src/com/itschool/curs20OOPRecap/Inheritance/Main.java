package com.itschool.curs20OOPRecap.Inheritance;

public class Main {

    public static void main(String[] args) {
        Dog DogInstance = new Dog();

        DogInstance.name = "Rex";
        DogInstance.age = 8;
        DogInstance.breed = "collie";
        DogInstance.species = "dog";

        DogInstance.bark();
        DogInstance.fetch(22);
    }

}
