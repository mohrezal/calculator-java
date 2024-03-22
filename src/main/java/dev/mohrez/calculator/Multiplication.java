package dev.mohrez.calculator;

public class Multiplication<T extends Number> implements ICalculator<T>{
    @Override
    public T calculate(T num1, T num2) throws ArithmeticException {
        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf(num1.longValue() * num2.longValue());
        } else {
            return (T) Integer.valueOf(num1.intValue() * num2.intValue());
        }
    }
}
