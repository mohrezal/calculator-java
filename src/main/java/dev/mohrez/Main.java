package dev.mohrez;

import dev.mohrez.calculator.Calculator;
public class Main {
    public static void main(String[] args)  {

       try{
           Calculator calculator = new Calculator();
           calculator.addition(-1.5,2);
           calculator.division(-12,10);
           calculator.subtraction(1.2,2);
           calculator.addition(22.5,4);
           calculator.addition(-1.5, 2);
           calculator.division(-12, 10);
           calculator.subtraction(1.2, 2);
           calculator.addition(22.5, 4);
           calculator.addition(5, 7);
           calculator.division(100, 10);
           calculator.subtraction(8, 3.5);
           calculator.addition(-10, -2);
           calculator.addition(3.14, 2.718);
           calculator.division(25, 5);
           calculator.subtraction(10, 7.5);
           calculator.addition(15, 9);
           calculator.addition(6, 3);
           calculator.division(50, 2);
           calculator.subtraction(20, 12);
           calculator.addition(7.5, 4.5);
           calculator.addition(-8, -6);
           calculator.division(144, 12);
           calculator.subtraction(18, 6.75);
           calculator.addition(100, 200);
           calculator.history();
       }catch (Exception exception) {
           System.out.println(exception.getMessage());
       }
    }
}
