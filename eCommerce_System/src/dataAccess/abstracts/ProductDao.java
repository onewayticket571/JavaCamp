package dataAccess.abstracts;

import entities.concretes.Customer;
import javafx.util.Pair;

import java.util.List;

public interface ProductDao {
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void updateCustomer(Customer customer);
    List<Customer> getAll();

}
