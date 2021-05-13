package dataAccess.concretes;

import dataAccess.abstracts.ProductDao;
import entities.concretes.Customer;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public void addCustomer(Customer customer) {
        System.out.println("Hibernate ile veritabanına eklendi : " + customer.getFirstName() + " " + customer.getLastName());
    }

    @Override
    public void deleteCustomer(Customer customer) {
        System.out.println("Hibernate ile veritabanından silindi : " + customer.getFirstName() + " " + customer.getLastName());
    }

    @Override
    public void updateCustomer(Customer customer) {
        System.out.println("Hibernate ile veritabanı güncellendi : " + customer.getFirstName() + " " + customer.getLastName());
    }

    @Override
    public List<Customer> getAll() {
        //Bura listeyi deneme yapmak için yazdık.
        List<Customer> customers= new ArrayList<Customer>();
        Customer customer1 = new Customer("Ayşe","YILMAZ","ayse1@gmail.com","123456");
        Customer customer2 = new Customer("Ahmet","TOK","ahmet.tok@hotmail.com","ahm33t");
        Customer customer3 = new Customer("Mehmet","SEVER","mesev.2021@yahoo.co.uk","password123");
        Customer customer4 = new Customer("Fatma","GÜR","f4tma-gur@outlook.com","45678961");
        Customer customer5 = new Customer("Hatice","AK","hatice.ak@aol.com","hatice2021");

        customers.add(customer1);
        customer1.setActivationStatus(true);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);


        return customers;
    }
}
