package dev.mohrez.calculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {
    private Addition addition = null;
    private final double DELTA = 0.000001;
    @Before
    public void setUp() {
        addition = new Addition();
    }
    @After
    public void cleanUp() {
        addition = null;
    }
    //ADDITION TEST
    @Test()
    public void additionTwoPositiveDoubleNumbers() {
        double result = addition.calculate(1.5, 4);
        assertEquals(5.5, result, DELTA);
    }

    @Test()
    public void additionTwoNegativeDoubleNumbers() {
        double result = addition.calculate(-1.87, -2);
        assertEquals(-3.87, result, DELTA);
    }

    @Test()
    public void additionWithZeroNumber() {
        double result = addition.calculate(1.0, 0);
        assertEquals(1.0, result, DELTA);
    }

    @Test()
    public void additionTwoPositiveIntNumbers() {
        int result = addition.calculate(1, 1);
        assertEquals(2, result);
    }

    @Test()
    public void additionTwoNegativeIntNumbers() {
        int result = addition.calculate(-10, -2);
        assertEquals(-12, result);
    }

    @Test()
    public void additionPositiveAndNegativeIntNumber() {
        int result = addition.calculate(-1, 1);
        assertEquals(0, result);
    }

    @Test()
    public void additionTwoPositiveShortNumber() {
        short result = addition.calculate((short) 1,  (short)1);
        assertEquals((short) 2, result);
    }

    @Test()
    public void additionTwoPositiveShortNumbers() {
        short result = addition.calculate((short)1, (short)1);
        assertEquals((short) 2, result);
    }

    @Test()
    public void additionTwoNegativeShortNumbers() {
        short result = addition.calculate((short) -10,(short) -2);
        assertEquals((short) -12, result);
    }

    @Test()
    public void additionPositiveAndNegativeShortNumber() {
        short result = addition.calculate((short)-1,(short) 1);
        assertEquals((short) 0, result);
    }

    @Test()
    public void additionTwoPositiveLongNumber() {
        long result = addition.calculate(1, 1);
        assertEquals(2L, result);
    }
}