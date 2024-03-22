package dev.mohrez.calculator;

public class Division<T extends Number> implements ICalculator<T>{
    @Override
    public T calculate(T num1, T num2) throws ArithmeticException {
        if (num2.doubleValue() == 0) {
            String errorMessage = String.format("You can not divide, s% by s%.",num1,num2);
            throw new ArithmeticException(errorMessage);
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
