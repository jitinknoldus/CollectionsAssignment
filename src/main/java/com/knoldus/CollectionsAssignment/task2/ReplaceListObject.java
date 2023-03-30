package com.knoldus.CollectionsAssignment.task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReplaceListObject {
    public static void main(String[] args) {
        // Create an ArrayList with 5 objects
        LinkedList<String> states = new LinkedList<>();
        states.add("UttarPradesh");
        states.add("Uttarakhand");
        states.add("Delhi");
        states.add("Haryana");
        states.add("Himachal Pradesh");


        // Replace all elements with one new object
        String newState = "Goa";

        for (int index = 0; index < states.size(); index++) {
            states.set(index, newState);
        }

        for (String state : states) {
            System.out.println(state);
        }
    }
}
