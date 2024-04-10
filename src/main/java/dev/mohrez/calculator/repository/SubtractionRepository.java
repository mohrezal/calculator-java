package dev.mohrez.calculator.repository;

import java.sql.Connection;

public class SubtractionRepository  extends CalculatorRepository{
    public SubtractionRepository(Connection connection) {
        super(connection, "subtraction");
    }
}
