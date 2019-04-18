package ru.ttv.patterns.provider;

import ru.ttv.patterns.ContractFactory;
import ru.ttv.patterns.provider.impl.XLSLoadProvider;
import ru.ttv.patterns.provider.impl.XLSUnloadProvider;
import ru.ttv.patterns.provider.impl.XLSValidateProvider;

/**
 * @author Teplykh Timofey  18.04.2019
 */
public class XLSContractFactory implements ContractFactory {
    public LoadProvider createLoadProvider() {
        return new XLSLoadProvider();
    }

    public UnloadProvider createUnloadProvider() {
        return new XLSUnloadProvider();
    }

    public ValidateProvider createValidateProvider() {
        return new XLSValidateProvider();
    }
}
