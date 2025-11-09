package com.itschool.Curs24.FunctionalInterfaces;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctInterfMain {


    public static void main(String[] args) {


        //using predefined Functional Interfaces

        //Predicate
        Predicate<Integer> predicateOfInt = predicatePar -> predicatePar % 2 ==0; //inline implementation of this interface's method "test()"
        //using the Predicate Interface's only method:
        boolean predicateResult = predicateOfInt.test(8);
        System.out.println("Result of predicate for integers: " + predicateResult);

        Predicate<String> predicateOfString = predicateParam -> predicateParam.length() > 5;
        boolean isStringLongerThanFive = predicateOfString.test("A string of some length");
        System.out.println("Result of predicate for strings: " + predicateResult);

        //Consumer                                                 //param must be input to a function that returns void
        Consumer<Integer> consumerOfInt = consumerPar -> System.out.println("Hello from inside the implementation of the \"accept()\" method to which the parameter: " + consumerPar + " is provided");
        Integer intToProcess = 123;
        System.out.println("We now provide an actual parameter to this consumer, of value: " + intToProcess);
        consumerOfInt.accept(intToProcess); //calling the only method of the Consumer<T> functional interface

        //Supplier
        //it does not accept any parameter
        Integer someInt1 = 243;
        Integer someInt2 = 342;
        Supplier<Integer> supplierOfInt = () -> someInt1 + someInt2 + 303;
        System.out.println("The value obtained from the supplier: " + supplierOfInt.get());

        //Function <paramtype, returntype>
        Function<Integer, Integer> functionInstance1 = functionParam -> functionParam * 3;
        System.out.println("Result of function1: " + functionInstance1.apply(56));


    }

}
