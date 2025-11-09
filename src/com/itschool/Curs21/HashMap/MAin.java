package com.itschool.Curs21.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MAin {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 38);
        map.put("Bob", 24);
        map.put("Ion", 21);

        int ageOfSomeMember = map.get("Bob");
        System.out.println("The age of Bob: " + ageOfSomeMember);

        System.out.println("-------- Parsing through the HashMap ------ ");

        for (String nameParser : map.keySet()) {
            int ageOfCurrentMapElement = map.get(nameParser);
            System.out.println(nameParser + " is " + ageOfCurrentMapElement + " years old.");
        }

        System.out.println("-------- Parsing through the HashMap - using Map.Entry<> this time ------ ");

        for (Map.Entry<String, Integer> mapEntryParser : map.entrySet()){
            String currentMapEntryKey = mapEntryParser.getKey();
            int currentMapEntryValue = mapEntryParser.getValue();
            System.out.println(currentMapEntryKey + " is " + currentMapEntryValue + " years old.");
        }
    }
}
