package ru.ttv.patterns.provider;

import ru.ttv.patterns.Contract;

/**
 * @author Teplykh Timofey  18.04.2019
 */
public interface ValidateProvider {
    Contract validateContract(Contract contract);
}
