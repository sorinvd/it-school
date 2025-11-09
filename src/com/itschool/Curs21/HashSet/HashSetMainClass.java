package com.itschool.Curs21.HashSet;

import java.util.HashSet;

public class HashSetMainClass {

    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();

        stringHashSet.add("apple");
        stringHashSet.add("banana");
        stringHashSet.add("pear");

        System.out.println("The hashset contains " + stringHashSet);
    }


}
