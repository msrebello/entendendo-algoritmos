package com.github.msrebello._04.duplicator;

import java.util.Arrays;

public class DuplicatorDemo {

    public static void main(String[] args) {
        int[] arrDuplicated = ArrayUtils.duplicate(new int[]{1, 2, 3});
        System.out.println(Arrays.toString(arrDuplicated)); // [1, 1, 2, 2, 3, 3]
    }

}
