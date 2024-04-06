package dev.mohrez.calculator;

import junit.framework.TestCase;
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
}