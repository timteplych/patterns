package ru.ttv.patterns.provider;

import ru.ttv.patterns.ContractFactory;
import ru.ttv.patterns.provider.impl.CSVLoadProvider;
import ru.ttv.patterns.provider.impl.CSVUnloadProvider;
import ru.ttv.patterns.provider.impl.CSVValidateProvider;

/**
 * @author Teplykh Timofey  18.04.2019
 */
public class CSVContractFactory implements ContractFactory {
    public LoadProvider createLoadProvider() {
        return new CSVLoadProvider();
    }

    public UnloadProvider createUnloadProvider() {
        return new CSVUnloadProvider();
    }

    public ValidateProvider createValidateProvider() {
        return new CSVValidateProvider();
    }
}
