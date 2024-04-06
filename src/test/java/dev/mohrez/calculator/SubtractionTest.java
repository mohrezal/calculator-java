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
}
