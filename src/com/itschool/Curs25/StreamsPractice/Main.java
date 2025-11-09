package com.itschool.Curs25.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filteredList = listOfNumbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());


        System.out.println("the resulted list after filter intermediate operation: " + filteredList);

        List<String> listOfWords = List.of("hello", "world", "psychology", "extraordinary");

        List<Integer> listOfLengths = listOfWords.stream() //result: a Stream (of strings) = Stream<String>
                .map(lambdaPar -> lambdaPar.length()) //result: a Stream (of integers) = Stream<Integer>
                .toList();

        System.out.println("the resulted list after \"map\" intermediate operation: " + listOfLengths);

        listOfNumbers.stream()
                .forEach(ConsumerPar -> System.out.println(ConsumerPar)); //folosind o interf.func. de tip Consumer, nu returneaza nimic, doar executa ceva cu parametrul
    }
}
