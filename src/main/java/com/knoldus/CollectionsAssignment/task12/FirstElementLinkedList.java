package com.knoldus.CollectionsAssignment.task12;

import java.util.LinkedList;

public class FirstElementLinkedList {
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(254);
        list.add(102);
        list.add(23);
        list.add(867);

        System.out.println("The given list is: " + list);

        System.out.println("\nMethod1: : "+list.peek());
        System.out.println("\nMethod2  : "+list.peekFirst());
        System.out.println("\nMethod3  : "+list.getFirst());

    }
}
