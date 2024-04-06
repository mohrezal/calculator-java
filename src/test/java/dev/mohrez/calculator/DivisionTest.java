package dev.mohrez.calculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

}