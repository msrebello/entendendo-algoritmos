package com.github.msrebello._04.binary_search;

public class RecursiveBinarySearch {

    private static final int NOT_FOUND = -1;

    public int recursiveBinarySearch(final int[] arr, final int item) {
        return search(arr, 0, arr.length - 1, item);
    }

    public int search(final int[] arr, int low, int high, final int item) {
        if (low <= high) {

            final int mid = low + (high - low) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] < item) {
                return search(arr, mid + 1, high, item);
            }
            return search(arr, low, mid - 1, item);
        }

        return NOT_FOUND;
    }

}
