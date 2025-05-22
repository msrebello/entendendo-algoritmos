package com.github.msrebello._03.countdown;

public class Timer {

    public static void printCountdown(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("Start number must be bigger than end number");
        }

        System.out.println(end);

        if (end > start) {
           printCountdown(start, end - 1);
       }
    }

    public static void printCountUp(int start, int end) {
        System.out.println(start);
        if (end < start) {
            throw new IllegalArgumentException("End number must be bigger than start number");
        }

        if (start < end) {
            printCountUp(start + 1, end);
        }
    }

}
