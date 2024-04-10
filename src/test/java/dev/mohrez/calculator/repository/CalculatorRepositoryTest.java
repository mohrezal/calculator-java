package dev.mohrez.calculator.repository;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculatorRepositoryTest {
    private CalculatorRepository additionRepository = null;


    @Before
    public void setUp() throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:h2:~/calculator", "mohammadreza", "12345");
        this.additionRepository = new AdditionRepository(connection);
    }

    @Test
    public void canSaveNewAdditionRecord() throws SQLException {
        CalculatorEntity newAdditionRecord = new CalculatorEntity("1 + 1 = 2");
        CalculatorEntity savedRecord = additionRepository.save(newAdditionRecord);
        assertEquals(savedRecord,newAdditionRecord);
    }
    @Test
    public void canSaveMultipleRecords() throws SQLException{
        CalculatorEntity newAdditionRecord = new CalculatorEntity("1 + 1 = 2");
        CalculatorEntity newAdditionRecord2 = new CalculatorEntity("2 + 1 = 3");
        CalculatorEntity newAdditionRecord3 = new CalculatorEntity("2 + 2 = 4");
        CalculatorEntity newAdditionRecord4 = new CalculatorEntity("2 + 3 = 5");
        CalculatorEntity newAdditionRecord5 = new CalculatorEntity("3 + 3 = 6");
        CalculatorEntity[] entities = {newAdditionRecord, newAdditionRecord2,newAdditionRecord3,newAdditionRecord4,newAdditionRecord5};
        List<CalculatorEntity> result = additionRepository.saveAll(entities);
        assertEquals(Arrays.asList(entities), result);

    }
    @Test
    public void canGetAllAdditionRecords() throws SQLException {
        CalculatorEntity newAdditionRecord = new CalculatorEntity("1 + 1 = 2");
        CalculatorEntity newAdditionRecord2 = new CalculatorEntity("2 + 1 = 3");
        CalculatorEntity newAdditionRecord3 = new CalculatorEntity("2 + 2 = 4");
        CalculatorEntity newAdditionRecord4 = new CalculatorEntity("2 + 3 = 5");
        CalculatorEntity newAdditionRecord5 = new CalculatorEntity("3 + 3 = 6");
        List<CalculatorEntity> calculatorEntities = additionRepository.saveAll(newAdditionRecord,newAdditionRecord3,newAdditionRecord2,newAdditionRecord4,newAdditionRecord5);
    }
}

