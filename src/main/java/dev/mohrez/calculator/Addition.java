package dev.mohrez.calculator;

public class Addition implements IOperation {

    @Override
    public long calculate(long num1, long num2) throws ArithmeticException {
        return num1 + num2;
    }

    @Override
    public int calculate(int num1, int num2) throws ArithmeticException {
        return num1 + num2;
    }

    @Override
    public double calculate(double num1, double num2) throws ArithmeticException {
        return num1 + num2;
    }

    @Override
    public short calculate(short num1, short num2) throws ArithmeticException {
        return (short) (num1 + num2);
    }

}
