package dev.mohrez.calculator.repository;

import java.sql.Connection;

abstract public class CalculatorRepository {
   private Connection connection = null;
   private String table = null;
    CalculatorRepository(Connection connection,String table){
                this.connection = connection;
                this.table = table;
    }
}
