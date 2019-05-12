package ru.ttv.patterns.observer;

import ru.ttv.patterns.Contract;
import ru.ttv.patterns.decorator.ContractTxtReader;
import ru.ttv.patterns.observer.ContractLoadObserver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Teplykh Timofey  01.05.2019
 */
public abstract class AbstractContractLoader {
    private List<ContractLoadObserver> contractLoadObservers = new ArrayList<>();

    public void attach(ContractLoadObserver observer){
        contractLoadObservers.add(observer);
    }

    public void detach(ContractLoadObserver observer){
        contractLoadObservers.remove(observer);
    }

    protected void notify(Contract contract){
        for(ContractLoadObserver observer: contractLoadObservers){
            observer.update(this,contract);
        }
    }
}
