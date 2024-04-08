package dev.mohrez.calculator.repository;

import java.sql.Connection;

public class AdditionRepository extends CalculatorRepository{
    public AdditionRepository(Connection connection) {
        super(connection, "addition");
    }
}
