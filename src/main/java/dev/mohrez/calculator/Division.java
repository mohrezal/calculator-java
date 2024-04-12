package dev.mohrez.calculator;

public class Division implements IOperation {
    @Override
    public Number calculate(Number num1, Number num2) throws ArithmeticException {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Both numbers must be provided");
        }

        double value1 = num1.doubleValue();
        double value2 = num2.doubleValue();

        if (value2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        return value1 / value2;
    }
}


