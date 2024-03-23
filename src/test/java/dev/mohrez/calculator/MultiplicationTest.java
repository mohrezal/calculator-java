package dev.mohrez.calculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {

    private Multiplication multiplication = null;
    private final double DELTA = 0.0001;
    @Before
    public void setUp() {
        multiplication = new Multiplication();
    }

    @After
    public void cleanUp() {
        multiplication = null;
    }

    // MULTIPLICATION TESTS
    @Test
    public void multiplicationTwoPositiveDoubleNumbers() {
        double result = multiplication.calculate(2.5, 4.0);
        assertEquals(10.0, result, DELTA);
    }

    @Test
    public void multiplicationTwoNegativeDoubleNumbers() {
        double result =  multiplication.calculate(-2.5, -4.0);
        assertEquals(10.0, result, DELTA);
    }

    @Test
    public void multiplicationWithZeroNumber() {

        double result =  multiplication.calculate(0.0, 5.0);
        assertEquals(0.0, result, DELTA);
    }

    @Test
    public void multiplicationTwoPositiveIntNumbers() {
        int result =  multiplication.calculate(5, 2);
        assertEquals(10, result);
    }

    @Test
    public void multiplicationTwoNegativeIntNumbers() {
        int result =  multiplication.calculate(-3, -4);
        assertEquals(12, result);
    }

    @Test
    public void multiplicationPositiveAndNegativeIntNumber() {

        int result =  multiplication.calculate(2, -3);
        assertEquals(-6, result);
    }

    @Test
    public void multiplicationTwoPositiveLongNumbers() {
        long result =  multiplication.calculate(100000L, 100L);
        assertEquals(10000000L, result);
    }

    @Test
    public void multiplicationTwoPositiveShortNumbers() {
        short result = multiplication.calculate((short) 100000, (short)100);
        assertEquals((short)10000000, result);
    }


}