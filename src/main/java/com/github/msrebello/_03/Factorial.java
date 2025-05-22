package com.github.msrebello._03;

public class Factorial {

    private final long result;

    public static Factorial of(int number) {
        return new Factorial(number);
    }

    private Factorial(int number) {
      result = calculate(number);
    }

    private long calculate(int number) {
        if (inputIsNotValid(number)) {
            throw new FactorialInvalidInputException("Input must be between 0 and 20 inclusive.");
        }
        return isNumberZeroOrOne(number) ? 1L : number * calculate(number - 1);
    }

    private static boolean inputIsNotValid(int number) {
        return number < 0 || number > 20;
    }

    private static boolean isNumberZeroOrOne(int number) {
        return number == 0 || number == 1;
    }

    public long getResult() {
        return result;
    }
}
