package business.abstracts;

import entities.concretes.Customer;

public interface LoginService{
    boolean login(String userEmail, String userPassword);
}
