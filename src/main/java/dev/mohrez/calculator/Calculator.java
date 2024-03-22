package dev.mohrez.calculator;

public class Calculator {
    public double add(double num1, double num2) {
        Addition<Double> addition = new Addition<>();
        return addition.calculate(num1,num2);
    }
    public long add(long num1, long num2){
        Addition<Long> addition = new Addition<>();
        return addition.calculate(num1,num2);
    }
    public int add(int num1, int num2){
        Addition<Integer> addition = new Addition<>();
        return addition.calculate(num1,num2);
    }
}
