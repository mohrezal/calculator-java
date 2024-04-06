package dev.mohrez.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {
    private Addition addition = null;

    @Before
    public void setUp() {
        addition = new Addition();
    }

    @After
    public void cleanUp() {
        addition = null;
    }

    @Test
    public void canAddTwoIntegers() {
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
    public void canAddIntAndDouble() {
        Number result = addition.calculate(2D, 3.5D);
        assertEquals(5.5D, result);
    }

    @Test
    public void canAddTwoDoubles() {
        Number result = addition.calculate(1.2D, 2.3D);
        assertEquals(3.5D, result);
    }

    @Test
    public void canAddPositiveAndNegativeDoubles() {
        Number result = addition.calculate(1.5D, -0.5D);
        assertEquals(1.0, result);
    }

    @Test
    public void canAddTwoFloats() {
        Number result = addition.calculate(1.2f, 2.3f);
        assertEquals(3.5f, result);
    }

    @Test
    public void canAddPositiveAndNegativeFloats() {
        Number result = addition.calculate(1.5f, -0.5f);
        assertEquals(1.0f, result);
    }

    @Test
    public void canAddTwoLongs() {
        Number result = addition.calculate(1000000000L, 2000000000L);
        assertEquals(3000000000L, result);
    }

    @Test
    public void canAddPositiveAndNegativeLongs() {
        Number result = addition.calculate(1500000000L, -500000000L);
        assertEquals(1000000000L, result);
    }

    @Test
    public void canAddTwoPositiveDoubles() {
        Number result = addition.calculate(1.2D, 2.3D);
        assertEquals(3.5, result);
    }
}
