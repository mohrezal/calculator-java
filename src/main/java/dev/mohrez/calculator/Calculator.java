package dev.mohrez.calculator;

import dev.mohrez.calculator.repository.*;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Calculator implements ICalculator {
    // Operation methods
    private final Addition addition = new Addition();
    private final Subtraction subtraction = new Subtraction();
    private final Multiplication multiplication = new Multiplication();
    private final Division division = new Division();

    private final CalculatorRepository additionRepository;
    private final CalculatorRepository multiplicationRepository;
    private final CalculatorRepository subtractionRepository;
    private final CalculatorRepository divisionRepository;

    public Calculator() throws SQLException {
        Dotenv dotenv = Dotenv.load();
        String jdbcUrl = dotenv.get("JDBC_URL");
        String jdbcUsername= dotenv.get("JDBC_USERNAME");
        String jdbcPassword = dotenv.get("JDBC_PASSWORD");
        Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
        additionRepository = new AdditionRepository(connection);
        multiplicationRepository = new MultiplicationRepository(connection);
        subtractionRepository = new SubtractionRepository(connection);
        divisionRepository = new DivisionRepository(connection);
    }

    @Override
    public Number multiplication(Number num1, Number num2) throws SQLException {
        Number result = multiplication.calculate(num1, num2);
        saveCalculation(multiplicationRepository, num1, "*", num2, result);
        return result;
    }

    @Override
    public Number addition(Number num1, Number num2) throws SQLException {
        Number result = addition.calculate(num1, num2);
        saveCalculation(additionRepository, num1, "+", num2, result);
        return result;
    }

    @Override
    public Number subtraction(Number num1, Number num2) throws SQLException {
        Number result = subtraction.calculate(num1, num2);
        saveCalculation(subtractionRepository, num1, "-", num2, result);
        return  result;
    }

    @Override
    public Number division(Number num1, Number num2) throws SQLException {
        Number result = division.calculate(num1, num2);
        saveCalculation(divisionRepository, num1, "/", num2, result);
        return result;
    }

    public void history() throws SQLException {
        List<CalculatorEntity> records = new ArrayList<>();
        records.addAll(additionRepository.findAll());
        records.addAll(divisionRepository.findAll());
        records.addAll(multiplicationRepository.findAll());
        records.addAll(subtractionRepository.findAll());
        for (CalculatorEntity record : records) {
            System.out.println(record.getStatement());
        }
    }


    private void saveCalculation(CalculatorRepository repository, Number num1, String operator, Number num2, Number result) throws SQLException {
        double num1Value = num1.doubleValue();
        double num2Value = num2.doubleValue();
        double resultValue = result.doubleValue();
        String statement = "(%.2f) %s (%.2f) = %.2f";
        String formattedStatement = String.format(statement, num1Value, operator, num2Value, resultValue);
        repository.save(new CalculatorEntity(formattedStatement));
    }

}
