package business.concretes;

import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Customer;
import javafx.util.Pair;

public class CustomerManager implements CustomerService {
    private ProductDao productDao;
    private CustomerCheckService customerCheckService;

    public CustomerManager(ProductDao productDao, CustomerCheckService customerCheckService) {
        this.productDao = productDao;
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void addCustomer(Customer customer) {
        boolean registrationStatus = true;
        if (productDao.getAll()!=null) { // eMail mevcut mu değil mi kontrol edilen yer
            for (Customer customerExists : productDao.getAll()) {
                if(customer.geteMail()==customerExists.geteMail()) {
                    System.out.println("Bu mail adresi kayıtlı!");
                    return;
                }
            }
        }
        if (!customerCheckService.checkIfValidEmail(customer)){ //eMail düzgün formatta mı, kontrol edilen yer
            System.out.println("Geçersiz e-posta adresi. Lütfen geçerli bir e-posta adresi giriniz.");
            registrationStatus =false;
        }
        if (!customerCheckService.checkIfValidName(customer)){//Ad Soyad düzgün formatta mı, kontrol edilen yer
            System.out.println("Geçersiz Ad veya Soyad. Lütfen en az iki karakterli ad ve soyad giriniz..");
            registrationStatus =false;
        }
        if (!customerCheckService.checkIfValidPassword(customer)){//Şifre düzgün formatta mı, kontrol edilen yer
            System.out.println("Geçersiz Şifre. Lütfen en az 6 karakterli bir şifre giriniz.");
            registrationStatus =false;
        }
        if (registrationStatus==false){
            System.out.println("Kayıt Başarısız!");
        }else{
            productDao.addCustomer(customer);
            System.out.println("Aktivasyon Maili gönderilmiştir.");
        }
    }

    @Override
    public void deleteCustomer(Customer customer) {
        productDao.updateCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        productDao.deleteCustomer(customer);
    }

    @Override
    public Customer get(String userEmail, String userPassword) {

        return null;
    }
}
