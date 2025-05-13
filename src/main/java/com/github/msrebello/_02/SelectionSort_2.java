package com.github.msrebello._02;

import java.util.Arrays;
import java.util.Objects;

public class SelectionSort_2 {

    public static void main(String[] args) {
        final int[] unsortedArray = {3, 17, 5, 96, 32, 21, 102, 0};

        System.out.println(Arrays.toString(unsortedArray)); // [3, 17, 5, 96, 32, 21, 102, 0]
        System.out.println(Arrays.toString(sort(unsortedArray))); // [0, 3, 5, 17, 21, 32, 96, 102]
    }

    private static int[] sort(final int[] arr) {
        Objects.requireNonNull(arr, "Array cannot be null");

        if (isEmpty(arr)) {
            return new int[]{};
        }

        final int[] arrayToSort = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[smallestIndex] > arrayToSort[j]) {
                    smallestIndex = j;
                }
            }

            final int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[smallestIndex];
            arrayToSort[smallestIndex] = temp;
        }

        return arrayToSort;
    }

    private static boolean isEmpty(int[] arr) {
        return arr.length == 0;
    }

}
