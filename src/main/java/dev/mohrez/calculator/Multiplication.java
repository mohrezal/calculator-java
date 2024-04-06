package dev.mohrez.calculator;

public class Multiplication implements IOperation {
    @Override
    public Number calculate(Number num1, Number num2) throws ArithmeticException {
        if(num1 == null || num2 == null){
            throw new IllegalArgumentException("Both number must be provided");
        }
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() * num2.doubleValue();
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() * num2.floatValue();
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() * num2.longValue();
        } else {
            return num1.intValue() * num2.intValue();
        }
    }
}
