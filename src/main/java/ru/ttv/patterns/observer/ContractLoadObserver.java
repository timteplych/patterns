package ru.ttv.patterns.observer;

import ru.ttv.patterns.Contract;

/**
 * @author Teplykh Timofey  01.05.2019
 */
public interface ContractLoadObserver {
    void update(AbstractContractLoader abstractContractLoader, Contract contract);
}
