package com.training.example.JacocoExample.Calculator;


public class Calculator {
    public int calculate(String input) {
        int result = 0;
        String[] arr = input.split("[+-/*]");
        if (input.contains("+")) {
            result = add(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        } else if (input.contains("-")) {
            result = subtract(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        } else if (input.contains("*")) {
            result = multiply(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        } else if (input.contains("/")) {
            result = divide(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        }
        return result;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    public boolean validateInputString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string is null");
        }
        return input.matches("[0-9]+[+-/*][0-9]+");
    }

}
