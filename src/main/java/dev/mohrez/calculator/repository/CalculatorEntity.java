package dev.mohrez.calculator.repository;

import java.util.UUID;

public class CalculatorEntity {
    private UUID id;
    private Number num1;
    private Number num2;
    private OperationType operation;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Number getNum1() {
        return num1;
    }

    public void setNum1(Number num1) {
        this.num1 = num1;
    }

    public Number getNum2() {
        return num2;
    }

    public void setNum2(Number num2) {
        this.num2 = num2;
    }

    public OperationType getOperation() {
        return operation;
    }

    public void setOperation(OperationType operation) {
        this.operation = operation;
    }
}
