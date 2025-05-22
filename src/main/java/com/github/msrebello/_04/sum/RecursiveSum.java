package com.github.msrebello._04.sum;

import java.util.Arrays;

public class RecursiveSum {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};

        System.out.println(sum(array)); // 10
    }

    private static int sum(int[] arr) {
       if (arr.length == 0) {
           return 0;
       }
       int[] remainingElements = Arrays.copyOfRange(arr, 1, arr.length);
       return arr[0] + sum(remainingElements);
    }

}
