package business.abstracts;

import entities.concretes.Customer;

public interface CustomerService {
    void addCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void updateCustomer(Customer customer);
    Customer get(String userEmail, String userPassword);
}
