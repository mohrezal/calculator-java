package dev.mohrez.calculator;

import dev.mohrez.calculator.repository.AdditionRepository;
import dev.mohrez.calculator.repository.CalculatorRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Calculator implements ICalculator {
    //OPERATION METHODS
    private final Addition addition = new Addition();
    private final Subtraction subtraction = new Subtraction();
    private final Multiplication multiplication = new Multiplication();
    private final Division division = new Division();

    //DATABASE CONNECTION
    Connection connection = DriverManager.getConnection("jdbc:h2:~/calculator","mohammadreza","12345");
    CalculatorRepository additionRepository = new AdditionRepository(connection);
        

    public Calculator() throws SQLException {
    }


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
