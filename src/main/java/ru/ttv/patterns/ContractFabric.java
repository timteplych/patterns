package ru.ttv.patterns;

import ru.ttv.patterns.provider.CSVContractFactory;
import ru.ttv.patterns.provider.DBFContractFactory;
import ru.ttv.patterns.provider.XLSContractFactory;

/**
 * @author Teplykh Timofey  18.04.2019
 */
public class ContractFabric {

    public final static String XLS_TYPE = "XLS";
    public final static String DBF_TYPE = "DBF";
    public final static String CSV_TYPE = "CSV";

    public ContractFactory createFactory(String name){
        switch (name){
            case XLS_TYPE: return new XLSContractFactory();
            case DBF_TYPE: return new DBFContractFactory();
            case CSV_TYPE: return new CSVContractFactory();
            default: return null;
        }
    }

    private static ContractFabric instance = new ContractFabric();

    public static ContractFabric getInstance(){
        return instance;
    }

    private ContractFabric(){

    }
}
