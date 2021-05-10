import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Adapter.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer(1,"Mehmet","YILMAZ",LocalDate.of(1900,1,10),"12345678910");

        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        baseCustomerManager.save(customer1);


    }
}
