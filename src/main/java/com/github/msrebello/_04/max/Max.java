package com.github.msrebello._04.max;

import java.util.Arrays;

public class Max {

    public static void main(String[] args) {
        int[] array = new int[]{1, 8, 3, 4};

        int max = max(array);
        System.out.println(max);
    }

    private static int max(int[] list) {
        if (list.length == 2) {
            return Math.max(list[0], list[1]);
        }

        int[] remainingElements = Arrays.copyOfRange(list, 1, list.length);
        int subMax = max(remainingElements);
        return Math.max(list[0], subMax);
    }

}
