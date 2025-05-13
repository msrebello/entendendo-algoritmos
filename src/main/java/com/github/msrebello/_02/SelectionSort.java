package com.github.msrebello._02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SelectionSort {

    public static void main(String[] args) {
        final List<Integer> unsortedList = List.of(3, 17, 5, 96, 32, 21, 102, 0);
        final List<Integer> sortedList = sort(unsortedList);

        System.out.println(sortedList); // [0, 3, 5, 17, 21, 32, 96, 102]
        System.out.println(unsortedList); // [3, 17, 5, 96, 32, 21, 102, 0]
    }

    private static List<Integer> sort(final List<Integer> unsortedList) {
        Objects.requireNonNull(unsortedList, "List cannot be null");

        if (unsortedList.isEmpty()) {
            return new ArrayList<>();
        }

        final List<Integer> sortedList = new ArrayList<>();
        final List<Integer> remainingElements = new ArrayList<>(unsortedList);

        while (!remainingElements.isEmpty()) {
            final int smallestIndex = findIndexOfSmallest(remainingElements);
            sortedList.add(remainingElements.remove(smallestIndex));
        }

        return sortedList;
    }

    private static int findIndexOfSmallest(List<Integer> list) {
        int smallest = list.get(0);
        int smallestIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            final Integer currentItem = list.get(i);
            if (currentItem < smallest) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

}
