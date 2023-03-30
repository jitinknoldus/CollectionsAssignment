package com.knoldus.CollectionsAssignment.task7;

import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);


        System.out.println("Original list elements  : ");
        for (Integer listItem: list) {
            System.out.print(listItem + " ");
        }


        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();


        System.out.print("\nNew array elements are : " + " ");
        for (Integer listItem: newList) {
            System.out.print(listItem + " ");

        }
    }

}
