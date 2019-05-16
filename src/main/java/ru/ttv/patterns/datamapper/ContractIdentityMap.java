package ru.ttv.patterns.datamapper;

import ru.ttv.patterns.Contract;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Teplykh Timofey  12.05.2019
 */
public class ContractIdentityMap {

    private Map<Long, Contract> contractMap = new HashMap<>();

    private ContractMapper contractMapper;

    public ContractIdentityMap(ContractMapper contractMapper) {
        this.contractMapper = contractMapper;
    }

    public Contract getByID(long id){
        if(contractMap.containsKey(id)){
            return contractMap.get(id);
        }
        Contract contract = null;
        try {
            contract = contractMapper.getById(id);
            contractMap.put(id,contract);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contract;
    }

    public List<Contract> getAllContracts(){
        try {
            return contractMapper.getAllContracts();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
