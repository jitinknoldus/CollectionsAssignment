package com.knoldus.CollectionsAssignment.task4;

import java.util.LinkedHashSet;

public class LinkedHashSetOperations {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integersSet = new LinkedHashSet<>();
        integersSet.add(10);
        integersSet.add(20);
        integersSet.add(30);
        integersSet.add(40);
        integersSet.add(50);

        System.out.println( "Original set: "+integersSet);

        // Remove an element from the set
        integersSet.remove(40);

        System.out.println("New  set: " + integersSet);
    }
}
