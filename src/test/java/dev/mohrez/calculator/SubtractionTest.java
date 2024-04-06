package dev.mohrez.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {
    private Subtraction subtraction = null;
    private final double DELTA = 0.000001;

    @Before
    public void setUp() {
        subtraction = new Subtraction();
    }

    @After
    public void cleanUp() {
        subtraction = null;
    }

    @Test
    public void canSubtractTwoIntegers() {
        Number result = subtraction.calculate(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void canSubtractNegativeIntegers() {
        Number result = subtraction.calculate(-5, -3);
        assertEquals(-2, result);
    }

    @Test
    public void canSubtractPositiveAndNegativeIntegers() {
        Number result = subtraction.calculate(5, -3);
        assertEquals(8, result);
    }

    @Test
    public void canSubtractIntAndDouble() {
        Number result = subtraction.calculate(5, 3.5);
        assertEquals(1.5, result);
    }

    @Test
    public void canSubtractTwoDoubles() {
        Number result = subtraction.calculate(2.5, 1.2);
        assertEquals(1.3, result);
    }

    @Test
    public void canSubtractPositiveAndNegativeDoubles() {
        Number result = subtraction.calculate(1.5, -2.0);
        assertEquals(3.5, result);
    }

    @Test
    public void canSubtractTwoFloats() {
        Number result = subtraction.calculate(3.5f, 1.5f);
        assertEquals(2.0f, result);
    }

    @Test
    public void canSubtractPositiveAndNegativeFloats() {
        Number result = subtraction.calculate(3.0f, -2.5f);
        assertEquals(5.5f, result);
    }

    @Test
    public void canSubtractTwoLongs() {
        Number result = subtraction.calculate(5000000L, 2000000L);
        assertEquals(3000000L, result);
    }
}
