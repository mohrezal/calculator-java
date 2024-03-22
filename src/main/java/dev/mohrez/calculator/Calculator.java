package dev.mohrez.calculator;

public class Calculator {
    public <T extends Number> T addition(T num1, T num2){
        Addition<T> addition =  new Addition<>();
        return addition.calculate(num1,num2);
    }
}
