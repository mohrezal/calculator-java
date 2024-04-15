package dev.mohrez.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {
    private Division division = null;
    private final double DELTA = 0.000001;

    @Before
    public void setUp() {
        division = new Division();
    }

    @After
    public void cleanUp() {
        division = null;
    }

    @Test
    public void canDivideTwoIntegers() {
        Number result = division.calculate(6, 3);
        assertEquals(2.0, result);
    }

    @Test
    public void canDivideNegativeIntegers() {
        Number result = division.calculate(-6, -3);
        assertEquals(2.0, result);
    }

    @Test
    public void canDividePositiveAndNegativeIntegers() {
        Number result = division.calculate(6, -3);
        assertEquals(-2.0, result);
    }

    @Test
    public void canDivideIntAndDouble() {
        Number result = division.calculate(6, 2.0);
        assertEquals(3.0, result);
    }

    @Test
    public void canDivideTwoDoubles() {
        Number result = division.calculate(6.0, 2.0);
        assertEquals(3.0, result);
    }

    @Test
    public void canDividePositiveAndNegativeDoubles() {
        Number result = division.calculate(6.0, -2.0);
        assertEquals(-3.0, result);
    }

    @Test
    public void canDivideTwoFloats() {
        Number result = division.calculate(6.0f, 2.0f);
        assertEquals(3.0, result);
    }

    @Test
    public void canDividePositiveAndNegativeFloats() {
        Number result = division.calculate(6.0f, -2.0f);
        assertEquals(-3.0, result);
    }

    @Test
    public void canDivideTwoLongs() {
        Number result = division.calculate(6000000000L, 2000000000L);
        assertEquals(3.0, result);
    }

    @Test
    public void canDividePositiveAndNegativeLongs() {
        Number result = division.calculate(6000000000L, -2000000000L);
        assertEquals(-3.0, result);
    }


    @Test(expected = ArithmeticException.class)
    public void cannotDivideByZero() {
        division.calculate(6, 0);
    }
}
