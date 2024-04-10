package dev.mohrez.calculator.repository;

import java.sql.Connection;

public class DivisionRepository extends CalculatorRepository{
    DivisionRepository(Connection connection) {
        super(connection, "division");
    }
}
