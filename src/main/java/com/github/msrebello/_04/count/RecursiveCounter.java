package com.github.msrebello._04.count;

import java.util.Arrays;

public class RecursiveCounter {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};

        int numOfElements = countElements(array);
        System.out.println(numOfElements);
    }

    private static int countElements(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int[] remainingElements = Arrays.copyOfRange(array, 1, array.length);
        return 1 + countElements(remainingElements);
    }

}
