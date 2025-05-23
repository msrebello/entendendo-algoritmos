package com.github.msrebello._04.quicksort;

public class QuickSort {

    public int[] sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }
        int[] copy = arr.clone();
        quicksort(copy, 0, arr.length - 1);
        return copy;
    }

    private void quicksort(int[] arr, int left, int right) {
        if (left < right) {
            int indexOfPivot = partition(arr, left, right);
            quicksort(arr, left, indexOfPivot - 1);
            quicksort(arr, indexOfPivot + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[right];

        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
