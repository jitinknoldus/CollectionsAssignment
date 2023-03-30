package com.knoldus.CollectionsAssignment.task3;

import java.util.ArrayList;
import java.util.Collections;

public class reverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(42);
        list.add(36);
        list.add(84);
        list.add(5);

        System.out.println("List before reversing: " + list);

        Collections.reverse(list);

        System.out.println("List after reversing: " + list);


    }
}
