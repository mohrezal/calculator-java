package dev.mohrez.calculator;

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

    @Test
    public void canAddTwoPositiveIntegers() {
        Number result = addition.calculate(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void canAddNegativeIntegers() {
        Number result = addition.calculate(-2, -3);
        assertEquals(-5, result);
    }

    @Test
    public void canAddPositiveAndNegativeIntegers() {
        Number result = addition.calculate(5, -3);
        assertEquals(2, result);
    }

    @Test
    public void canAddPositiveAndZeroIntegers() {
        Number result = addition.calculate(5, 0);
        assertEquals(5, result);
    }

    @Test
    public void canAddZeroAndNegativeIntegers() {
        Number result = addition.calculate(0, -3);
        assertEquals(-3, result);
    }

    @Test
    public void canAddZeroAndZeroIntegers() {
        Number result = addition.calculate(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void canAddLargeIntegers() {
        Number result = addition.calculate(1000000, 2000000);
        assertEquals(3000000, result);
    }

    @Test
    public void canAddDecimalAndInteger() {
        Number result = addition.calculate(1.5, 2);
        assertEquals(3.5, result);
    }

    @Test
    public void canAddTwoPositiveDoubles() {
        Number result = addition.calculate(1.2, 2.3);
        assertEquals(3.5, result);
    }

    @Test
    public void canAddTwoNegativeDoubles() {
        Number result = addition.calculate(-1.2, -2.3);
        assertEquals(-3.5, result);
    }

    @Test
    public void canAddPositiveAndNegativeDoubles() {
        Number result = addition.calculate(1.5, -0.5);
        assertEquals(1.0, result);
    }

    @Test
    public void canAddPositiveAndZeroDoubles() {
        Number result = addition.calculate(1.5, 0.0);
        assertEquals(1.5, result);
    }

    @Test
    public void canAddZeroAndNegativeDoubles() {
        Number result = addition.calculate(0.0, -1.5);
        assertEquals(-1.5, result);
    }

    @Test
    public void canAddTwoPositiveFloats() {
        Number result = addition.calculate(1.2f, 2.3f);
        assertEquals(3.5f, result);
    }

    @Test
    public void canAddTwoNegativeFloats() {
        Number result = addition.calculate(-1.2f, -2.3f);
        assertEquals(-3.5f, result);
    }

    @Test
    public void canAddPositiveAndNegativeFloats() {
        Number result = addition.calculate(1.5f, -0.5f);
        assertEquals(1.0f, result);
    }

    @Test
    public void canAddPositiveAndZeroFloats() {
        Number result = addition.calculate(1.5f, 0.0f);
        assertEquals(1.5f, result);
    }

    @Test
    public void canAddZeroAndNegativeFloats() {
        Number result = addition.calculate(0.0f, -1.5f);
        assertEquals(-1.5f, result);
    }

    @Test
    public void canAddTwoPositiveLongs() {
        Number result = addition.calculate(1000000000L, 2000000000L);
        assertEquals(3000000000L, result);
    }

    @Test
    public void canAddTwoNegativeLongs() {
        Number result = addition.calculate(-1000000000L, -2000000000L);
        assertEquals(-3000000000L, result);
    }

    @Test
    public void canAddPositiveAndNegativeLongs() {
        Number result = addition.calculate(1500000000L, -500000000L);
        assertEquals(1000000000L, result);
    }

    @Test
    public void canAddPositiveAndZeroLongs() {
        Number result = addition.calculate(1500000000L, 0L);
        assertEquals(1500000000L, result);
    }

    @Test
    public void canAddZeroAndNegativeLongs() {
        Number result = addition.calculate(0L, -1500000000L);
        assertEquals(-1500000000L, result);
    }
}
