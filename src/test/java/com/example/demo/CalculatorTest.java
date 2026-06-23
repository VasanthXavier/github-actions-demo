package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        int value = calculator.add(4, 1);
        assertEquals(7, value);
    }

    @Test
    void testSubtract() {
        int value = calculator.subtract(10, 3);
        assertEquals(7, value);
    }
}
