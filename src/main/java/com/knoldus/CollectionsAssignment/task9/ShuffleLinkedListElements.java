package com.knoldus.CollectionsAssignment.task9;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLinkedListElements {
    public static void main(String[] args) {
        LinkedList<Integer> originalList = new LinkedList<>();
        originalList.add(15);
        originalList.add(42);
        originalList.add(36);
        originalList.add(84);
        originalList.add(5);

        System.out.println("The list before shuffling elements: ");
        for(Integer list : originalList){
            System.out.print(list +" ");
        }
        Collections.shuffle(originalList);
        System.out.println("\nThe list after shuffling elements: ");
        for(Integer list: originalList)
        {
            System.out.print(list +" ");
        }
    }
}
