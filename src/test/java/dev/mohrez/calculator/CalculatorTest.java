package dev.mohrez.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = null;

    @Before
    public void setUp() throws SQLException {
        calculator = new Calculator();
    }

    @After
    public void cleanUp() {
        calculator = null;
    }

    @Test
    public void testMultiplication() throws SQLException {
        assertEquals(2, calculator.multiplication(1, 2));
        assertEquals(-6.0, calculator.multiplication(-2.0, 3.0));
        assertEquals(0L, calculator.multiplication(0, 100L));
        assertEquals(-20.0, calculator.multiplication(5.0, -4L));
        assertEquals(25.0F, calculator.multiplication(5.0f, 5));
    }


    @Test
    public void testAddition() throws SQLException {
        assertEquals(3, calculator.addition(1, 2));
        assertEquals(0.0, calculator.addition(-2.0, 2));
        assertEquals(100L, calculator.addition(0, 100L));
        assertEquals(1.0, calculator.addition(5, -4.0));
        assertEquals(7.5, calculator.addition(3.5f, 4.0));
    }

    @Test
    public void testSubtraction() throws SQLException {
        assertEquals(0, calculator.subtraction(2, 2));
        assertEquals(-5.0, calculator.subtraction(-2, 3.0));
        assertEquals(-100L, calculator.subtraction(0, 100L));
        assertEquals(9.5f, calculator.subtraction(5, -4.5f));
    }

    @Test
    public void testDivision() throws SQLException {
        assertEquals(1.0, calculator.division(2, 2));
        assertEquals(-1.0, calculator.division(-2, 2.0));
        assertEquals(0.0, calculator.division(0, 100L));
        assertEquals(-1.25, calculator.division(-5, 4.0));
        assertEquals(2.5, calculator.division(10.0f, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() throws SQLException {
        calculator.division(10, 0);
    }
}
