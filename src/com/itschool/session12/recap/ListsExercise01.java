package com.itschool.session12.recap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsExercise01 {
    public static void main(String[] args) {
        ArrayList<String> ArrListOfStrings = new ArrayList<>();
        List<String> LinkedListOfStrings = new LinkedList<>();

        ArrListOfStrings.add("String 1");
        ArrListOfStrings.add("String 2");
        ArrListOfStrings.add("String 3");
        ArrListOfStrings.add("String 4");

        LinkedListOfStrings.add("String L1");
        LinkedListOfStrings.add("String L2");
        LinkedListOfStrings.add("String L3");
        LinkedListOfStrings.add("String L4");
        LinkedListOfStrings.add("String L5");

        int i = 0;

        do {
            System.out.println("String at position " + i + " in ArrListOfStrings is: " + ArrListOfStrings.get(i));
            i++;
        } while (i<ArrListOfStrings.size());

        i = 0;
        do {
            System.out.println("String at position " + i + " in LinkedListOfStrings is: " + LinkedListOfStrings.get(i));
            i++;
        } while (i<ArrListOfStrings.size());

    }
}
