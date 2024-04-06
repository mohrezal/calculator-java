package dev.mohrez.calculator;

public class Calculator implements ICalculator {
    private final Addition addition = new Addition();
    private final Subtraction subtraction = new Subtraction();
    private final Multiplication multiplication = new Multiplication();
    private final Division division = new Division();

    @Override
    public Number multiplication(Number num1, Number num2) {
        return multiplication.calculate(num1,num2);
    }

    @Override
    public Number addition(Number num1, Number num2) {
        return addition.calculate(num1,num2);
    }

    @Override
    public Number subtraction(Number num1, Number num2) {
        return subtraction.calculate(num1,num2);
    }

    @Override
    public Number division(Number num1, Number num2) {
        return division.calculate(num1,num2);
    }
}
