package ru.ttv.patterns.observer;

import ru.ttv.patterns.Contract;
import ru.ttv.patterns.decorator.ContractTxtReader;

import java.io.IOException;

/**
 * @author Teplykh Timofey  01.05.2019
 */
public class ContractLoader extends AbstractContractLoader {
    public void load(){
        ContractTxtReader contractTxtReader = new ContractTxtReader();
        try {
            Contract contract1 = contractTxtReader.readTxtContract("fileContract.txt");
            notify(contract1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
