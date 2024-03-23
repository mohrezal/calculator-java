package dev.mohrez.calculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class DivisionTest {

    private Division division = null;
    private final double DELTA = 0.0001;
    @Before
    public void setUp() {
        division = new Division();
    }
    @After
    public void cleanUp() {
        division = null;
    }
    //DIVISION TESTS
    @Test
    public void divisionTwoPositiveDoubleNumbers() {
        double result = division.calculate(10.0, 2.0);
        assertEquals(5.0, result, DELTA);
    }

    @Test
    public void divisionTwoNegativeDoubleNumbers() {
        double result = division.calculate(-10.0, -2.0);
        assertEquals(5.0, result, DELTA);
    }

    @Test
    public void divisionWithZeroNumber() {
        double result = division.calculate(0.0, 5.0);
        assertEquals(0.0, result, DELTA);
    }
    @Test
    public void divisionTwoPositiveIntNumbers() {
        int result = division.calculate(10, 2);
        assertEquals(5, result);
    }
    @Test
    public void divisionTwoNegativeIntNumbers() {
        int result = division.calculate(-10, -2);
        assertEquals(5, result);
    }
    @Test
    public void divisionPositiveAndNegativeIntNumber() {
        int result = division.calculate(10, -2);
        assertEquals(-5, result);
    }
    @Test
    public void divisionTwoPositiveLongNumbers() {
        long result = division.calculate(100000L, 100L);
        assertEquals(1000L, result);
    }
    @Test
    public void divisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            division.calculate(10.0, 0.0);
        });
    }
    @Test
    public void divisionTwoPositiveShortNumbers() {
        short result =division.calculate((short) 10, (short) 2.0);
        assertEquals((short)5, result);
    }
}