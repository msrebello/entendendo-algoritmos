package com.github.msrebello._01;

public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {17, 31, 56, 72, 99 };

        System.out.println(binarySearch(sortedArray, 72)); // index 3 returned
        System.out.println(binarySearch(sortedArray, 100)); // not found, -1 returned
        System.out.println(binarySearch(sortedArray, 17)); // index 0 returned
    }

    public static int binarySearch(int[] arr, int item) {
        int low  = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess == item)
                return mid;
            if (guess > item)
                high = mid - 1;
            else
                low = mid + 1;

        }

        return -1;
    }

}
