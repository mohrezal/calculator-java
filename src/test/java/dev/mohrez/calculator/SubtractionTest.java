package dev.mohrez.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {
    private Subtraction subtraction= null;
    private final double DELTA = 0.000001;

    @Before
    public void setUp(){
        subtraction = new Subtraction();
    }
    @After
    public void cleanUp() {
        subtraction = null;
    }

    // SUBTRACTION TESTS
    @Test()
    public void subtractTwoPositiveDoubleNumbers() {
        double result = subtraction.calculate(1, 2);
        assertEquals(-1, result, DELTA);
    }

    @Test()
    public void subtractTwoNegativeDoubleNumbers() {
        double result = subtraction.calculate(-1, -1);
        assertEquals(0, result, DELTA);
    }

    @Test()
    public void subtractWithZeroNumber() {
        double result = subtraction.calculate(0, 0);
        assertEquals(0, result, DELTA);
    }

    @Test()
    public void subtractTwoPositiveIntNumbers() {
        int result = subtraction.calculate(5, 1);
        assertEquals(4, result);
    }

    @Test()
    public void subtractTwoNegativeIntNumbers() {
        int result = subtraction.calculate(-1, -2);
        assertEquals(1L, result);
    }

    @Test()
    public void subtractPositiveAndNegativeIntNumber() {
        int result = subtraction.calculate(1, -1);
        assertEquals(2, result);
    }

    @Test()
    public void subtractTwoPositiveLongNumber() {
        long result = subtraction.calculate(1L, 1L);
        assertEquals(0L, result);
    }

    @Test()
    public void subtractTwoPositiveShortNumbers() {
        short result = subtraction.calculate((short) 5, (short) 1);
        assertEquals((short) 4, result);
    }

    @Test()
    public void subtractTwoNegativeShortNumbers() {
        int result = subtraction.calculate((short) -1, (short) -2);
        assertEquals((short) 1, result);
    }

    @Test()
    public void subtractPositiveAndNegativeShortNumber() {
        short result = subtraction.calculate((short) 1, (short) -1);
        assertEquals(2, result);
    }

    @Test()
    public void subtractTwoPositiveShortNumber() {
        short result = subtraction.calculate((short) 1, (short) 1);
        assertEquals((short) 0, result);
    }
}
