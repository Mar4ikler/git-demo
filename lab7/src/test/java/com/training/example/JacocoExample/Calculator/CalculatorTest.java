package com.training.example.JacocoExample.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testPlusOperation() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.calculate("2+2"));
    }
    @Test
    void testMultiplyOperation() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.calculate("2*5"));
    }
    @Test
    void testDivideOperation() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.calculate("8/2"));
    }
    @Test
    void testSubtractOperation() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.calculate("6-2"));
    }

    @Test
    void resultShouldReturnFalseIfInputStringHasNoOperation() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.validateInputString("2 2"));
    }

    @Test
    void resultShouldReturnFalseIfInputStringHasNoSecondOperand() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.validateInputString("2*"));
    }

    @Test
    void resultShouldReturnFalseIfInputStringHasNoFirstOperand() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.validateInputString("*2"));
    }

    @Test
    void resultShouldReturnFalseIfInputStringIsEmpty() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.validateInputString(""));
    }

    @Test
    void resultShouldReturnFalseIfInputStringHasNonExistingOperation() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.validateInputString("2%3"));
    }

    @Test
    void resultShouldReturnFalseIfInputStringIsWord() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.validateInputString("Hello"));
    }

    @Test
    void resultShouldReturnFalseIfInputStringHasTwoOperations() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.validateInputString("2+3*4"));
    }

    @Test
    void testShouldThrowIfInputLineIsNull() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.validateInputString(null));
    }
}