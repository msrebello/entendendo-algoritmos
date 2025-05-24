package com.github.msrebello._04.duplicator;

public class ArrayUtils {

    private ArrayUtils() {
    }

    public static int[] duplicate(int[] items) {
        int len = items.length * 2;
        int[] duplicated = new int[len];

        int i = 0, j = 0;
        while (i < items.length) {
            duplicated[j] = items[i];
            duplicated[j + 1] = items[i];

            j += 2;
            i++;
        }

        return duplicated;
    }

}
