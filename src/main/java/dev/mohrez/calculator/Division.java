package dev.mohrez.calculator;

public class Division<T extends Number> implements ICalculator<T>{
    @Override
    public T calculate(T num1, T num2) throws ArithmeticException {
        if (num2.doubleValue() == 0) {
            throw new ArithmeticException("Dividing by zero is not allowed.");
        }

        double result = num1.doubleValue() / num2.doubleValue();

        if (num1 instanceof Double || num2 instanceof Double) {
            return (T) Double.valueOf(result);
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return (T) Long.valueOf((long) result);
        } else {
            return (T) Integer.valueOf((int) result);
        }
    }
}
