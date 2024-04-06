package dev.mohrez.calculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {

    private Multiplication multiplication = null;
    private final double DELTA = 0.000001;
    @Before
    public void setUp() {
        multiplication = new Multiplication();
    }

    @After
    public void cleanUp() {
        multiplication = null;
    }

}