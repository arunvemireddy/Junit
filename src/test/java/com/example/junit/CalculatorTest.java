package com.example.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	@Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.sub(3, 2));
        assertEquals(-3, calculator.sub(0, 3));
        assertEquals(0, calculator.sub(5, 5));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-15, calculator.multiply(3, -5));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2, calculator.divide(8, -4));
        assertEquals(-4, calculator.divide(8, -2));
        
        // Test division by zero
        try {
            calculator.divide(1, 0);
            // If no exception is thrown, fail the test
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected exception, do nothing
        }
    }

}
