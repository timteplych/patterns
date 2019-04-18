package ru.ttv.patterns;

import ru.ttv.patterns.provider.LoadProvider;
import ru.ttv.patterns.provider.ValidateProvider;
import ru.ttv.patterns.provider.UnloadProvider;

/**
 * @author Teplykh Timofey  18.04.2019
 */
public interface ContractFactory {
    LoadProvider createLoadProvider();
    UnloadProvider createUnloadProvider();
    ValidateProvider createValidateProvider();
}
