package com.knoldus.CollectionsAssignment.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingElementsToCollectoinObject {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Jitin");
        names.add("Anshika");
        names.add("Jassi");

        System.out.println("Original List : ");

        for (String index: names){
            System.out.print(index + " ");
        }

        Collections.addAll(names,"John","Jack");

        System.out.println("\nAfter adding elements:");

        for (String index: names){
            System.out.print(index+" ");
        }

    }
}
