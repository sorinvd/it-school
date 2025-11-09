package com.itschool.Curs24.LamdaExpressionsAnonymousClasses;

public class Main {

    public static void main(String[] args) {

        SomeInterf interfInstance = new SomeInterf() {
            @Override
            public String displayInterf() {
                return "The interface function implemented inline";
            }
        }; //the content of the "class" was implemented online -- that's why the ; after the }
        //this is possible because it has only one method -- which makes it a so-called "functional interface"
        System.out.println(interfInstance.displayInterf());


        //alternative with lambda-expression:

        SomeInterf interfInstanceWLambda = () -> "The interface function implemented using Lambda expr"; //implemented its "displayInterf()" method inline
        System.out.println("Invoking interface with lambda implementation: " + interfInstanceWLambda.displayInterf());





    }

}
