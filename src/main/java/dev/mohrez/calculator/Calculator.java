package dev.mohrez.calculator;

public class Calculator {
    public <T extends Number> T addition(T num1, T num2){
        Addition<T> addition =  new Addition<>();
        return addition.calculate(num1,num2);
    }
    public <T extends Number> T subtraction(T num1, T num2){
        Subtraction<T> subtraction = new Subtraction<>();
        return subtraction.calculate(num1,num2);
    }
    public <T extends Number> T multiplication(T num1,T num2){
        Multiplication<T> multiplication = new Multiplication<>();
        return multiplication.calculate(num1,num2);
    }
}
