package dev.mohrez;

import dev.mohrez.calculator.Calculator;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Calculator calculator = new Calculator();
        calculator.addition(-1.5,2);
        calculator.division(-12,10);
        calculator.subtraction(1.2,2);
        calculator.addition(22.5,4);
        calculator.history();
    }
}
