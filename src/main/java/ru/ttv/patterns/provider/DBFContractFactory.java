package ru.ttv.patterns.provider;

import ru.ttv.patterns.ContractFactory;
import ru.ttv.patterns.provider.impl.DBFLoadProvider;
import ru.ttv.patterns.provider.impl.DBFUnloadProvider;
import ru.ttv.patterns.provider.impl.DBFValidateProvider;

/**
 * @author Teplykh Timofey  18.04.2019
 */
public class DBFContractFactory implements ContractFactory {
    public LoadProvider createLoadProvider() {
        return new DBFLoadProvider();
    }

    public UnloadProvider createUnloadProvider() {
        return new DBFUnloadProvider();
    }

    public ValidateProvider createValidateProvider() {
        return new DBFValidateProvider();
    }
}
