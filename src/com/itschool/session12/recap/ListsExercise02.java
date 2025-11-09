package com.itschool.session12.recap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListsExercise02 {
    public static void main(String[] args) {
        List<Integer> IntList = new LinkedList<>();

        System.out.println("Please provide the number of numbers: ");
        Scanner myScannerObj = new Scanner(System.in);
        int NumbersToRead = myScannerObj.nextInt();

        int i = 0;
        int CurrentNr;
        do {
            System.out.println("Please provide element at position " + i + ": ");
            CurrentNr = myScannerObj.nextInt();
            IntList.add(CurrentNr);
            i++;
        } while (i<NumbersToRead);


        System.out.println(IntList);

    }
}
