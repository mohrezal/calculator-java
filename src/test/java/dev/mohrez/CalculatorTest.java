package dev.mohrez;

import dev.mohrez.calculator.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

    //ADDITION TEST
    @Test()
    public void additionTwoPositiveDoubleNumbers() {
        double result = calculator.addition(1.5, 4).doubleValue();
        assertEquals(5.5, result, DELTA);
    }

    @Test()
    public void additionTwoNegativeDoubleNumbers() {
        double result = calculator.addition(-1.87, -2).doubleValue();
        assertEquals(-3.87, result, DELTA);
    }

    @Test()
    public void additionWithZeroNumber() {
        double result = calculator.addition(1.0, 0).doubleValue();
        assertEquals(1.0, result, DELTA);
    }

    @Test()
    public void additionTwoPositiveIntNumbers() {
        int result = calculator.addition(1, 1);
        assertEquals(2, result);
    }

    @Test()
    public void additionTwoNegativeIntNumbers() {
        int result = calculator.addition(-10, -2);
        assertEquals(-12, result);
    }

    @Test()
    public void additionPositiveAndNegativeIntNumber() {
        int result = calculator.addition(-1, 1);
        assertEquals(0, result);
    }

    @Test()
    public void additionTwoPositiveLongNumber() {
        long result = calculator.addition(1, 1);
        assertEquals(2L, result);
    }

    //SUBTRACTION TESTS
    @Test()
    public void subtractionTwoPositiveDoubleNumbers(){
        double result  = calculator.subtraction(1,2);
        assertEquals(-1,result,DELTA);
    }

    @Test()
    public void subtractionTwoNegativeDoubleNumbers(){
        double result  = calculator.subtraction(-1,-1);
        assertEquals(0,result,DELTA);
    }
    @Test()
    public void subtractionWithZeroNumber(){
        double result  = calculator.subtraction(0,0);
        assertEquals(0,result,DELTA);
    }
    @Test()
    public  void subtractionTwoPositiveIntNumbers(){
        int result = calculator.subtraction(5,1);
        assertEquals(4,result);
    }
    @Test()
    public void subtractionTwoNegativeIntNumbers(){
        int result = calculator.subtraction(-1,-2);
        assertEquals(1L,result);
    }
    @Test()
    public void subtractionPositiveAndNegativeIntNumber(){
        int result = calculator.subtraction(1,-1);
        assertEquals(2,result);
    }
    @Test()
    public void subtractionTwoPositiveLongNumber(){
        long result = calculator.subtraction(1L,1L);
        assertEquals(0L,result);
    }
}