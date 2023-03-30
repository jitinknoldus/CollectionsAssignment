package com.knoldus.CollectionsAssignment.task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumElementFromList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: : " + list);

        Integer min = Collections.min(list);
        System.out.println("Minimum element : " + min);
    }
}
