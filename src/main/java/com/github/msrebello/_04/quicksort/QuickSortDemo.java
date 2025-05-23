package com.github.msrebello._04.quicksort;

import java.util.Arrays;

public class QuickSortDemo {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] arr = {10, 7, 8, 9, 1, 5};
        int[] sortedArray = quickSort.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortedArray));
    }

}
