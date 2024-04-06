package dev.mohrez.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    private Multiplication multiplication = null;
    @Before
    public void setUp() {
        multiplication = new Multiplication();
    }

    @After
    public void cleanUp() {
        multiplication = null;
    }

    @Test
    public void canMultiplyTwoIntegers() {
        Number result = multiplication.calculate(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void canMultiplyNegativeIntegers() {
        Number result = multiplication.calculate(-2, -3);
        assertEquals(6, result);
    }

    @Test
    public void canMultiplyPositiveAndNegativeIntegers() {
        Number result = multiplication.calculate(2, -3);
        assertEquals(-6, result);
    }

    @Test
    public void canMultiplyIntAndDouble() {
        Number result = multiplication.calculate(2, 3.5);
        assertEquals(7.0, result);
    }

    @Test
    public void canMultiplyTwoDoubles() {
        Number result = multiplication.calculate(1.2, 2.5);
        assertEquals(3.0, result);
    }

    @Test
    public void canMultiplyPositiveAndNegativeDoubles() {
        Number result = multiplication.calculate(1.5, -2.0);
        assertEquals(-3.0, result);
    }

    @Test
    public void canMultiplyTwoFloats() {
        Number result = multiplication.calculate(1.5f, 2.5f);
        assertEquals(3.75f, result);
    }

    @Test
    public void canMultiplyPositiveAndNegativeFloats() {
        Number result = multiplication.calculate(1.5f, -2.0f);
        assertEquals(-3.0f, result);
    }

    @Test
    public void canMultiplyTwoLongs() {
        Number result = multiplication.calculate(3000000L, 2L);
        assertEquals(6000000L, result);
    }
}
