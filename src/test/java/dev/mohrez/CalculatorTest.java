package dev.mohrez;

import dev.mohrez.calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    private Calculator calculator = null;
    private final double DELTA = 0.0001;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void cleanUp() {
        calculator = null;
    }

    //ADDITION TEST
    @Test()
    public void additionTwoPositiveDoubleNumbers() {
        double result = calculator.addition(1.5, 4).doubleValue();
        assertEquals(5.5, result, DELTA);
    }

    @Test()
    public void additionTwoNegativeDoubleNumbers() {
        double result = calculator.addition(-1.87, -2).doubleValue();
        assertEquals(-3.87, result, DELTA);
    }

    @Test()
    public void additionWithZeroNumber() {
        double result = calculator.addition(1.0, 0).doubleValue();
        assertEquals(1.0, result, DELTA);
    }

    @Test()
    public void additionTwoPositiveIntNumbers() {
        int result = calculator.addition(1, 1);
        assertEquals(2, result);
    }

    @Test()
    public void additionTwoNegativeIntNumbers() {
        int result = calculator.addition(-10, -2);
        assertEquals(-12, result);
    }

    @Test()
    public void additionPositiveAndNegativeIntNumber() {
        int result = calculator.addition(-1, 1);
        assertEquals(0, result);
    }

    @Test()
    public void additionTwoPositiveLongNumber() {
        long result = calculator.addition(1, 1);
        assertEquals(2L, result);
    }

    //SUBTRACTION TESTS
    @Test()
    public void subtractionTwoPositiveDoubleNumbers() {
        double result = calculator.subtraction(1, 2);
        assertEquals(-1, result, DELTA);
    }

    @Test()
    public void subtractionTwoNegativeDoubleNumbers() {
        double result = calculator.subtraction(-1, -1);
        assertEquals(0, result, DELTA);
    }

    @Test()
    public void subtractionWithZeroNumber() {
        double result = calculator.subtraction(0, 0);
        assertEquals(0, result, DELTA);
    }

    @Test()
    public void subtractionTwoPositiveIntNumbers() {
        int result = calculator.subtraction(5, 1);
        assertEquals(4, result);
    }

    @Test()
    public void subtractionTwoNegativeIntNumbers() {
        int result = calculator.subtraction(-1, -2);
        assertEquals(1L, result);
    }

    @Test()
    public void subtractionPositiveAndNegativeIntNumber() {
        int result = calculator.subtraction(1, -1);
        assertEquals(2, result);
    }

    @Test()
    public void subtractionTwoPositiveLongNumber() {
        long result = calculator.subtraction(1L, 1L);
        assertEquals(0L, result);
    }

    // MULTIPLICATION TESTS
    @Test
    public void multiplicationTwoPositiveDoubleNumbers() {
        double result = calculator.multiplication(2.5, 4.0);
        assertEquals(10.0, result, DELTA);
    }

    @Test
    public void multiplicationTwoNegativeDoubleNumbers() {
        double result = calculator.multiplication(-2.5, -4.0);
        assertEquals(10.0, result, DELTA);
    }

    @Test
    public void multiplicationWithZeroNumber() {

        double result = calculator.multiplication(0.0, 5.0);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    public void multiplicationTwoPositiveIntNumbers() {
        int result = calculator.multiplication(5, 2);
        assertEquals(10, result);
    }

    @Test
    public void multiplicationTwoNegativeIntNumbers() {
        int result = calculator.multiplication(-3, -4);
        assertEquals(12, result);
    }

    @Test
    public void multiplicationPositiveAndNegativeIntNumber() {

        int result = calculator.multiplication(2, -3);
        assertEquals(-6, result);
    }

    @Test
    public void multiplicationTwoPositiveLongNumbers() {
        long result = calculator.multiplication(100000L, 100L);
        assertEquals(10000000L, result);
    }

    //DIVISION TESTS
    @Test
    public void divisionTwoPositiveDoubleNumbers() {
        double result = calculator.division(10.0, 2.0);
        assertEquals(5.0, result, DELTA);
    }

    @Test
    public void divisionTwoNegativeDoubleNumbers() {
        double result = calculator.division(-10.0, -2.0);
        assertEquals(5.0, result, DELTA);
    }

    @Test
    public void divisionWithZeroNumber() {
        double result = calculator.division(0.0, 5.0);
        assertEquals(0.0, result, DELTA);
    }
    @Test
    public void divisionTwoPositiveIntNumbers() {
        int result = calculator.division(10, 2);
        assertEquals(5, result);
    }
    @Test
    public void divisionTwoNegativeIntNumbers() {
        int result = calculator.division(-10, -2);
        assertEquals(5, result);
    }
    @Test
    public void divisionPositiveAndNegativeIntNumber() {
        int result = calculator.division(10, -2);
        assertEquals(-5, result);
    }
    @Test
    public void divisionTwoPositiveLongNumbers() {
        long result = calculator.division(100000L, 100L);
        assertEquals(1000L, result);
    }
    @Test
    public void divisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.division(10.0, 0.0);
        });
    }

}