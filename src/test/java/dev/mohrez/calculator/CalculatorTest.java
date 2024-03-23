package dev.mohrez.calculator;

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
        double result = calculator.addition(1.5, 4);
        assertEquals(5.5, result, DELTA);
    }

    @Test()
    public void additionTwoNegativeDoubleNumbers() {
        double result = calculator.addition(-1.87, -2);
        assertEquals(-3.87, result, DELTA);
    }

    @Test()
    public void additionWithZeroNumber() {
        double result = calculator.addition(1.0, 0);
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
    public void additionTwoPositiveShortNumber() {
        short result = calculator.addition((short) 1,  (short)1);
        assertEquals((short) 2, result);
    }

    @Test()
    public void additionTwoPositiveShortNumbers() {
        short result = calculator.addition((short)1, (short)1);
        assertEquals((short) 2, result);
    }

    @Test()
    public void additionTwoNegativeShortNumbers() {
        short result = calculator.addition((short) -10,(short) -2);
        assertEquals((short) -12, result);
    }

    @Test()
    public void additionPositiveAndNegativeShortNumber() {
        short result = calculator.addition((short)-1,(short) 1);
        assertEquals((short) 0, result);
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

    @Test()
    public void subtractionTwoPositiveShortNumbers() {
        short result = calculator.subtraction((short) 5, (short) 1);
        assertEquals((short) 4, result);
    }

    @Test()
    public void subtractionTwoNegativeShortNumbers() {
        int result = calculator.subtraction((short) -1,(short) -2);
        assertEquals((short) 1, result);
    }

    @Test()
    public void subtractionPositiveAndNegativeShortNumber() {
        short result = calculator.subtraction((short)1,(short) -1);
        assertEquals(2, result);
    }

    @Test()
    public void subtractionTwoPositiveShortNumber() {
        short result = calculator.subtraction((short) 1, (short) 1);
        assertEquals((short) 0, result);
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

    @Test
    public void multiplicationTwoPositiveShortNumbers() {
        short result = calculator.multiplication((short) 100000, (short)100);
        assertEquals((short)10000000, result);
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
    @Test
    public void divisionTwoPositiveShortNumbers() {
        short result = calculator.division((short) 10, (short) 2.0);
        assertEquals((short)5, result);
    }

}