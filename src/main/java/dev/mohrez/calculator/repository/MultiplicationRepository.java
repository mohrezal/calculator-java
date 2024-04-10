package dev.mohrez.calculator.repository;

import java.sql.Connection;

public class MultiplicationRepository extends CalculatorRepository {
    MultiplicationRepository(Connection connection) {
        super(connection, "multiplication");
    }
}
