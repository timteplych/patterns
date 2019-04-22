package ru.ttv.patterns.decorator;

import ru.ttv.patterns.Contract;

import java.io.*;

/**
 * @author Teplykh Timofey  22.04.2019
 */
public class ContractTxtReader  {

    private BufferedReader bufferedReader;


    public Contract readTxtContract(String path) throws IOException {

        bufferedReader = new BufferedReader(new FileReader(path));
        String firstString = bufferedReader.readLine();
        String[] firstStringMas = firstString.split(";");
        Contract contract = new Contract();
        contract.setName(firstStringMas[0]);
        contract.setConsumer(firstStringMas[1]);
        contract.setCurrency(firstStringMas[2]);
        return contract;
    }
}
