package business.abstracts;

import entities.concretes.Customer;

public interface CustomerCheckService {
    boolean checkIfValidEmail(Customer customer);
    boolean checkIfValidName(Customer customer);
    boolean checkIfValidPassword(Customer customer);
}
