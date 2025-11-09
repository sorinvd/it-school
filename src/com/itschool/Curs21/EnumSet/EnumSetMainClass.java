package com.itschool.Curs21.EnumSet;

import java.util.EnumSet;

public class EnumSetMainClass {

    public static void main(String[] args) {

        EnumSet<DaysOfWeek> weekendEnumSet = EnumSet.of(DaysOfWeek.Saturday, DaysOfWeek.Sunday);

        System.out.println("Content of weekendEnumSet: " + weekendEnumSet);

        weekendEnumSet.add(DaysOfWeek.Friday);

        System.out.println("Updated Content of weekendEnumSet: " + weekendEnumSet);
    }
}
