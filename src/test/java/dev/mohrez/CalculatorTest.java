package dev.mohrez;

import dev.mohrez.calculator.Calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator = null;
    private final double DELTA = 0.0001;
    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test()
    public void additionTwoPositiveDoubleNumbers(){
        double result = calculator.addition(1.5,4).doubleValue();
        assertEquals(5.5,result,DELTA);
    }
    @Test()
    public void  additionTwoNegativeDoubleNumbers(){
        double result = calculator.addition(-1.87,-2).doubleValue();
        assertEquals(-3.87,result,DELTA);
    }
    @Test()
    public void additionWithZeroNumber(){
        double result =  calculator.addition(1.0,0).doubleValue();
        assertEquals(1.0,result,DELTA);
    }
}