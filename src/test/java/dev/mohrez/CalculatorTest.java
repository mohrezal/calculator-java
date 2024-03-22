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
       double result =  calculator.add(2.5,3);
        assertEquals(5.5,result,DELTA);
    }
    @Test()
    public void  additionTwoNegativeDoubleNumbers(){
        double result = calculator.add(-1.87,-2);
        assertEquals(-3.87,result,DELTA);
    }
    @Test()
    public void additionWithZeroNumber(){
        double result =  calculator.add(1.0,0);
        assertEquals(1.0,result,DELTA);
    }
}