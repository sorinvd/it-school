package com.itschool.session12.recap;

import java.util.Scanner;

public class LoopsExercise05 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner myScannerObj = new Scanner(System.in);
        int InputInteger = myScannerObj.nextInt();
        int SumOfDigits = 0;

        while (InputInteger!=0)
        {
            SumOfDigits += InputInteger % 10;
            InputInteger = InputInteger / 10;
        }

        System.out.println("The sum of its digits: " + SumOfDigits);
    }
}
