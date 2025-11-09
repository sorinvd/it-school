package com.itschool.session12.recap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Exercise6Lists {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        System.out.println("List content BEFORE add instructions: " + myList);
        System.out.println("Is myList empty?" + " " + myList.isEmpty());

        myList.add(10);
        myList.add(33);
        myList.add(0, 44);
        myList.addLast(111);
        System.out.println("List content after add instructions: " + myList);

        Collections.reverse(myList);
        System.out.println("List content after reverse operation: " + myList);

        LinkedList<Integer> myLinkedList = new LinkedList<>();
    }
}
