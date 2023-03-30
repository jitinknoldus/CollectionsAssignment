package com.knoldus.CollectionsAssignment.task6;

import java.util.LinkedList;

public class SwapElementsLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> integersList = new LinkedList<>();
        integersList.add(100);
        integersList.add(26);
        integersList.add(89);
        integersList.add(24);
        integersList.add(52);

        System.out.println("original list : " + integersList);

        // Swap the second and fourth number in the list
        int number1 = integersList.get(0);
        int number2= integersList.get(4);
        integersList.set(0, number2);
        integersList.set(4, number1);

        System.out.println("new list : " + integersList);

    }
}
