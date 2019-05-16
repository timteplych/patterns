package ru.ttv.patterns;

import ru.ttv.patterns.datamapper.ContractIdentityMap;
import ru.ttv.patterns.datamapper.ContractMapper;
import ru.ttv.patterns.mvc.Controller;
import ru.ttv.patterns.mvc.HtmlView;
import ru.ttv.patterns.mvc.Model;
import ru.ttv.patterns.observer.ContractLoader;
import ru.ttv.patterns.observer.DBObserver;
import ru.ttv.patterns.observer.UserObserver;
import ru.ttv.patterns.provider.LoadProvider;
import ru.ttv.patterns.provider.UnloadProvider;
import ru.ttv.patterns.provider.ValidateProvider;

import java.sql.Connection;
import java.util.List;

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

        //Contract mapper, identity map
        Connection connection = null;
        ContractIdentityMap contractIdentityMap = new ContractIdentityMap(new ContractMapper(connection));
        List<Contract> contractList = contractIdentityMap.getAllContracts();
        Contract contract1 = contractIdentityMap.getByID(10);

        //MVC
        Controller controller = new Controller(new Model(),new HtmlView());
        System.out.println(controller.action("Name","Viktor"));

    }
}
