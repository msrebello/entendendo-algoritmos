package com.github.msrebello._02;

import java.util.Arrays;

public class SelectionSort_2 {

    public static void main(String[] args) {
        final int[] unsortedArray = {3, 17, 5, 96, 32, 21, 102, 0};

        System.out.println(Arrays.toString(unsortedArray)); // [3, 17, 5, 96, 32, 21, 102, 0]
        System.out.println(Arrays.toString(sort(unsortedArray))); // [0, 3, 5, 17, 21, 32, 96, 102]
    }

    private static int[] sort(final int[] arr) {
         final int[] arrayToSort = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                final int currentItem = arrayToSort[i];
                final int nextItem = arrayToSort[j];
                if (currentItem > nextItem) {
                    arrayToSort[j] = currentItem;
                    arrayToSort[i] = nextItem;
                }
            }
        }

        return arrayToSort;
    }

}
