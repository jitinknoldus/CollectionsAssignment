package com.knoldus.CollectionsAssignment.task8;

import java.util.ArrayList;
import java.util.Collections;

public class IndexOfSubList {
    public static void main(String[] args) {
        ArrayList<Integer> mainList = new ArrayList<>();
        mainList.add(1);
        mainList.add(2);
        mainList.add(3);
        mainList.add(4);
        mainList.add(5);
        mainList.add(6);
        mainList.add(7);
        mainList.add(8);

        ArrayList<Integer> subList = new ArrayList<>();
        subList.add(3);
        subList.add(4);
        subList.add(5);

        Integer index = Collections.indexOfSubList(mainList, subList);
        System.out.println("Index of the mainList is : " + index);

    }
}
