package com.training.example.JacocoExample;


import com.training.example.JacocoExample.Calculator.Calculator;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your expression: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            if (calculator.validateInputString(input)) {
                System.out.println("Result: " + calculator.calculate(input));
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}
