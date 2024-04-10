package dev.mohrez.calculator.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

abstract public class CalculatorRepository {
    private final String INSERT_NEW_STATEMENT = "INSERT INTO %s (id, statement) VALUES (?, ?)";
    private final String SELECT_ALL = "SELECT * FROM %s";
   private Connection connection = null;
   private String table = null;
    CalculatorRepository(Connection connection,String table){
                this.connection = connection;
                this.table = table;
    }

    public CalculatorEntity save(CalculatorEntity entity) throws SQLException {
        String sql = String.format(INSERT_NEW_STATEMENT,table);
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1,entity.getId());
        statement.setObject(2,entity.getStatement());
        statement.executeUpdate();
        return entity;
    }

    public List<CalculatorEntity> saveAll(CalculatorEntity...calculatorEntities) throws SQLException {
        String sql = String.format(INSERT_NEW_STATEMENT,table);
        PreparedStatement statement = connection.prepareStatement(sql);

        for (CalculatorEntity calculatorEntity:calculatorEntities){
            this.save(calculatorEntity);
        }
        return List.of(calculatorEntities);
    }

    public List<CalculatorEntity> findAll() throws SQLException {
        List<CalculatorEntity> entities = new ArrayList<>();
        String sql = String.format(SELECT_ALL,table);
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            CalculatorEntity entity = new CalculatorEntity();
            entity.setId(resultSet.getObject("id", UUID.class));
            entity.setStatement(resultSet.getObject("statement",String.class));
            entities.add(entity);
        }
        return entities;
    }

}
