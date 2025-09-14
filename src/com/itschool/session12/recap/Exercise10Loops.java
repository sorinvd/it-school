package com.itschool.session12.recap;

import java.util.Scanner;

public class Exercise10Loops {
    /*Create a Java program to check if a given word is a palindrome using a loop.
    A palindrome is a word, number, phrase, or
    other sequence of symbols that reads the same backwards as forwards,
    such as “madam” or “racecar”.
     */

    public static void main(String[] args) {

        System.out.println("Please insert a word: ");
        Scanner myScannerObj = new Scanner(System.in);
        String myStringObj = myScannerObj.nextLine();

        char[] myCharArray = myStringObj.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < myCharArray.length / 2; i++)
        {
            System.out.println("Now checking character at index " + i);
            if (myCharArray[i] != myCharArray[myCharArray.length-i-1])
                isPalindrome = false;
        }

        //alternative:
        for for (int i = 0; i < myStringObj.length(); i++)
        {
            if (myStringObj.charAt(i) != myStringObj.charAt(myStringObj.length() - 1 - i))
            {
                isPalindrome = false;
            }
        }

        System.out.println("The given word is palindrome: " + isPalindrome);
    }
}
