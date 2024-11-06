package com.socgen.development;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
public static void main(String[] args) {

//    String []values = new String[3];

    List<String> listOfNames = new ArrayList<>(); //Polymorphic Assignment

    listOfNames.add("Waleed");
    listOfNames.add("Tanishq");
    listOfNames.add("Mohit");
    listOfNames.add("Tanishq");
//    listOfNames.add(670);
//    listOfNames.add(56.90);
//    listOfNames.add(new ListDemo());

    String value = listOfNames.get(2);

    listOfNames.remove("Mohit");

    System.out.println(listOfNames.size());

//    System.out.println(listOfNames);

//    for(String item : listOfNames){
//        System.out.println(item);
//    }

//    Or with Java 8 forEach
    listOfNames.forEach(System.out::println);
}

    @Override
    public String toString() {
        return "Hey there I am an object of ListDemo";
    }
}

// List (Store duplicates)
//     - ArrayList
//     - LinkedList
// Set (No duplicates allowed)
//     - HashSet
//     - TreeSet
// Map (Key/value)
//     - HashMap
//     - TreeMap
