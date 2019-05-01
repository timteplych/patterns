package ru.ttv.patterns.observer;

import ru.ttv.patterns.Contract;

/**
 * @author Teplykh Timofey  01.05.2019
 */
public class DBObserver implements ContractLoadObserver {
    @Override
    public void update(AbstractContractLoader abstractContractLoader, Contract contract) {
        System.out.println(contract.getName());
    }
}
