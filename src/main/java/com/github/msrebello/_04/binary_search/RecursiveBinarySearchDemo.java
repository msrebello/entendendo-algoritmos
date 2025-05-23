package com.github.msrebello._04.binary_search;

public class RecursiveBinarySearchDemo {

    public static void main(String[] args) {
        RecursiveBinarySearch bsr = new RecursiveBinarySearch();
        int[] arr = new int[]{17, 31, 56, 72, 99};

        System.out.println(bsr.recursiveBinarySearch(arr, 72)); // index 3 returned
        System.out.println(bsr.recursiveBinarySearch(arr, 100)); //  not found, -1 returned
    }

}
