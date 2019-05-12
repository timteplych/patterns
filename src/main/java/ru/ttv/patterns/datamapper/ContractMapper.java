package ru.ttv.patterns.datamapper;

import ru.ttv.patterns.Contract;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Teplykh Timofey  12.05.2019
 */
public class ContractMapper {

    private final Connection connection;

    public ContractMapper(Connection connection) {
        this.connection = connection;
    }

    public List<Contract> getAllContracts() throws SQLException {
        List<Contract> contracts = new ArrayList<>();
        PreparedStatement statement = connection.prepareStatement(
                "SELECT ID, TITLE, CURRENCY, CONSUMER FROM CONTRACT");
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Contract contract = new Contract();
                contract.setName(resultSet.getString(2));
                contract.setCurrency(resultSet.getString(3));
                contract.setConsumer(resultSet.getString(4));
                contracts.add(contract);
            }
        }
        return contracts;
    }

    public Contract getById(long id) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(
                "SELECT ID, TITLE, CURRENCY, CONSUMER FROM CONTRACT WHERE ID = ?");
        statement.setLong(1,id);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                Contract contract = new Contract();
                contract.setName(resultSet.getString(2));
                contract.setCurrency(resultSet.getString(3));
                contract.setConsumer(resultSet.getString(4));
                return contract;
            }
        }
        return null;
    }
}
