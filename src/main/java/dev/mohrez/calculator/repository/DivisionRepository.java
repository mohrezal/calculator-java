package dev.mohrez.calculator.repository;

import java.sql.Connection;

public class DivisionRepository extends CalculatorRepository{
    public DivisionRepository(Connection connection) {
        super(connection, "division");
    }
}
