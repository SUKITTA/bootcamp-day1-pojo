package com.digitalacadamy.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAddFunction(){
        int resp = calculator.add(1, 1);
        assertEquals(2, resp);
        assertEquals(4, calculator.add(3, 1));
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    void testMinusFunction(){
        int resp = calculator.minus(1, 1);
        assertEquals(0, resp);
        assertEquals(2, calculator.minus(3, 1));
        assertEquals(-1, calculator.minus(2, 3));
    }

    @Test
    void testMultiplyFunction(){
        int resp = calculator.multiply(1, 1);
        assertEquals(1, resp);
        assertEquals(3, calculator.multiply(3, 1));
        assertEquals(0, calculator.multiply(3, 0));
    }

    @Test
    void testDivideFunction(){
        int resp = calculator.divide(1, 1);
        assertEquals(1, resp);
        assertEquals(3, calculator.divide(3, 1));
        assertEquals(4, calculator.divide(8, 2));
    }

    @Test
    void testDivideWithErrorFunction(){
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

}
