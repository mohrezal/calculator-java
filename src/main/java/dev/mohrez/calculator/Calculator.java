package dev.mohrez.calculator;

public class Calculator implements ICalculator {
    private final Addition addition = new Addition();
    private final Subtraction subtraction = new Subtraction();
    private final Multiplication multiplication = new Multiplication();
    private final Division division = new Division();

    // ADDITION METHODS
    @Override
    public double addition(double num1, double num2){
        return addition.calculate(num1,num2);
    }

    @Override
    public long addition(long num1, long num2){
        return addition.calculate(num1,num2);
    }
    @Override
    public short addition(short num1, short num2){
        return addition.calculate(num1,num2);
    }
    @Override
    public int addition(int num1, int num2){
        return addition.calculate(num1,num2);
    }

    //SUBTRACTION METHODS

    @Override
    public long subtraction(long num1, long num2){
        return subtraction.calculate(num1,num2);
    }

    @Override
    public int subtraction(int num1, int num2){
        return subtraction.calculate(num1,num2);
    }

    @Override
    public short subtraction(short num1, short num2){
        return subtraction.calculate(num1,num2);
    }

    @Override
    public double subtraction(double num1, double num2){
        return subtraction.calculate(num1,num2);
    }
    //MULTIPLICATION METHODS
    @Override
    public long multiplication(long num1, long num2){
        return multiplication.calculate(num1,num2);
    }

    @Override
    public int multiplication(int num1, int num2){
        return multiplication.calculate(num1,num2);
    }

    @Override
    public short multiplication(short num1, short num2){
        return multiplication.calculate(num1,num2);
    }

    @Override
    public double multiplication(double num1, double num2){
        return multiplication.calculate(num1,num2);
    }

    //DIVISION METHODS
    @Override
    public long division(long num1, long num2){
        return division.calculate(num1,num2);
    }

    @Override
    public int division(int num1, int num2){
        return division.calculate(num1,num2);
    }

    @Override
    public short division(short num1, short num2){
        return division.calculate(num1,num2);
    }

    @Override
    public double division(double num1, double num2){
        return division.calculate(num1,num2);
    }
}
