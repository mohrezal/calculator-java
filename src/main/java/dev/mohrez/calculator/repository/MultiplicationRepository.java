package dev.mohrez.calculator.repository;

import java.sql.Connection;

public class MultiplicationRepository extends CalculatorRepository {
    public MultiplicationRepository(Connection connection) {
        super(connection, "multiplication");
    }
}
