package dev.mohrez.calculator;

import java.sql.SQLException;

public interface ICalculator {
    Number multiplication(Number num1, Number num2) throws SQLException;
    Number addition(Number num1, Number num2) throws SQLException;
    Number subtraction(Number num1, Number num2) throws SQLException;
    Number division(Number num1, Number num2) throws SQLException;
}
