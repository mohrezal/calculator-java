package dev.mohrez.calculator;

@FunctionalInterface
public interface ICalculator<T extends Number> {
    T calculate(T num1,T num2) throws ArithmeticException;
}
