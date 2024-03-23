package dev.mohrez.calculator;

public interface IOperation {
//    T calculate(T num1,T num2) throws ArithmeticException;

    long calculate(long num1,long num2) throws ArithmeticException;
    int calculate(int num1,int num2) throws ArithmeticException;
    double calculate(double num1,double num2) throws ArithmeticException;
    short calculate(short num1,short num2) throws ArithmeticException;
}
