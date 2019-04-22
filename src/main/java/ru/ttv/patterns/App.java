package ru.ttv.patterns;

import ru.ttv.patterns.decorator.ContractTxtReader;
import ru.ttv.patterns.provider.LoadProvider;
import ru.ttv.patterns.provider.UnloadProvider;
import ru.ttv.patterns.provider.ValidateProvider;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ContractFactory contractFactory = ContractFabric.getInstance().createFactory("DBF");
        LoadProvider loadProvider = contractFactory.createLoadProvider();
        Contract contract = loadProvider.loadContract("pathToFile");
        ValidateProvider validateProvider = contractFactory.createValidateProvider();
        validateProvider.validateContract(contract);
        UnloadProvider unloadProvider = contractFactory.createUnloadProvider();
        unloadProvider.unloadContract(contract);

        ContractTxtReader contractTxtReader = new ContractTxtReader();
        try {
            Contract contract1 = contractTxtReader.readTxtContract("fileContract.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
