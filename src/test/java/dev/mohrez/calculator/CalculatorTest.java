package dev.mohrez.calculator;

import dev.mohrez.calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    private Calculator calculator = null;
    private final double DELTA = 0.000001;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void cleanUp() {
        calculator = null;
    }

    @Test
    public void additionDouble() {
        assertEquals(5.0, calculator.addition(2.0, 3.0), DELTA);
    }

    @Test
    public void additionLong() {
        assertEquals(5L, calculator.addition(2L, 3L));
    }

    @Test
    public void additionInt() {
        assertEquals(5, calculator.addition(2, 3));
    }

    @Test
    public void additionShort() {
        assertEquals((short) 5, calculator.addition((short) 2, (short) 3));
    }

    // Subtraction methods tests
    @Test
    public void subtractionDouble() {
        assertEquals(2.0, calculator.subtraction(5.0, 3.0), DELTA);
    }

    @Test
    public void subtractionLong() {
        assertEquals(2L, calculator.subtraction(5L, 3L));
    }

    @Test
    public void subtractionInt() {
        assertEquals(2, calculator.subtraction(5, 3));
    }

    @Test
    public void subtractionShort() {
        assertEquals((short) 2, calculator.subtraction((short) 5, (short) 3));
    }

    // Multiplication methods tests
    @Test
    public void multiplicationDouble() {
        assertEquals(6.0, calculator.multiplication(2.0, 3.0), DELTA);
    }

    @Test
    public void multiplicationLong() {
        assertEquals(6L, calculator.multiplication(2L, 3L));
    }

    @Test
    public void multiplicationInt() {
        assertEquals(6, calculator.multiplication(2, 3));
    }

    @Test
    public void multiplicationShort() {
        assertEquals((short) 6, calculator.multiplication((short) 2, (short) 3));
    }

    // Division methods tests
    @Test
    public void divisionDouble() {
        assertEquals(2.0, calculator.division(6.0, 3.0), DELTA);
    }

    @Test
    public void divisionLong() {
        assertEquals(2L, calculator.division(6L, 3L));
    }

    @Test
    public void divisionInt() {
        assertEquals(2, calculator.division(6, 3));
    }

    @Test
    public void divisionShort() {
        assertEquals((short) 2, calculator.division((short) 6, (short) 3));
    }

    // Test division by zero
    @Test
    public void divisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.division(5.0, 0.0));
    }

}