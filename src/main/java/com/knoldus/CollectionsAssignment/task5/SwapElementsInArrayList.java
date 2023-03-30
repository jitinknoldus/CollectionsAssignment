package com.knoldus.CollectionsAssignment.task5;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElementsInArrayList {

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(63);
            numbers.add(82);
            numbers.add(57);
            numbers.add(21);

            System.out.println("Before swapping: " + numbers);

            // Swap elements at index 2 and index 3
            Collections.swap(numbers, 1, 3);

            System.out.println("After swapping: " + numbers);
        }
    }
