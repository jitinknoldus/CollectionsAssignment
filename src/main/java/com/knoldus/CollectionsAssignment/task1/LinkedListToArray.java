package com.knoldus.CollectionsAssignment.task1;

import java.util.LinkedList;

public class LinkedListToArray {

    public static void main(String[] args) {
        // Creating a LinkedList with 5 objects
        LinkedList<String> states = new LinkedList<>();
        states.add("UttarPradesh");
        states.add("Uttarakhand");
        states.add("Delhi");
        states.add("Haryana");
        states.add("Himachal Pradesh");

        // Converting the LinkedList to an Array
        String[] student_array = states.toArray(new String[0]);


        for (String state : states) {
            System.out.println(state);
        }

    }
}
