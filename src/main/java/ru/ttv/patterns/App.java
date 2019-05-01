package ru.ttv.patterns;

import ru.ttv.patterns.observer.ContractLoader;
import ru.ttv.patterns.observer.DBObserver;
import ru.ttv.patterns.observer.UserObserver;
import ru.ttv.patterns.provider.LoadProvider;
import ru.ttv.patterns.provider.UnloadProvider;
import ru.ttv.patterns.provider.ValidateProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Abstract fabric
        ContractFactory contractFactory = ContractFabric.getInstance().createFactory("DBF");
        LoadProvider loadProvider = contractFactory.createLoadProvider();
        Contract contract = loadProvider.loadContract("pathToFile");
        ValidateProvider validateProvider = contractFactory.createValidateProvider();
        validateProvider.validateContract(contract);
        UnloadProvider unloadProvider = contractFactory.createUnloadProvider();
        unloadProvider.unloadContract(contract);

        //Observer
        ContractLoader contractLoader = new ContractLoader();
        contractLoader.attach(new UserObserver());
        contractLoader.attach(new DBObserver());
        contractLoader.load();

    }
}
