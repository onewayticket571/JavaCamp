package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        // Burayı Mernis çalışmazsa, test olarak kullanabiliriz
        return true;
    }
}
