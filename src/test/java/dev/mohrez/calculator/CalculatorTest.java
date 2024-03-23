package dev.mohrez.calculator;

import dev.mohrez.calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    private Calculator calculator = null;
    private final double DELTA = 0.0001;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void cleanUp() {
        calculator = null;
    }




}