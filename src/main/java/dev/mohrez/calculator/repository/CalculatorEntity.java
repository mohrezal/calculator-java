package dev.mohrez.calculator.repository;

import java.util.UUID;

public class CalculatorEntity {
    private String statement;
    private UUID id;

    public CalculatorEntity() {
        this.id = UUID.randomUUID();
    }

    public CalculatorEntity(String statement){
        this.id = UUID.randomUUID();
        this.statement = statement;
    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}
