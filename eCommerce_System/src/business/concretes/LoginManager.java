package business.concretes;

import business.abstracts.LoginService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Customer;

public class LoginManager implements LoginService {
    private ProductDao productDao;

    public LoginManager(ProductDao productDao) {
        this.productDao = productDao;
    }


    @Override
    public boolean login(String userEmail, String userPassword) {
        for (Customer customerLogged:productDao.getAll()){
            if (userEmail==customerLogged.geteMail() && userPassword== customerLogged.getPassword()){
                if (customerLogged.isActivationStatus()){
                    System.out.println("Giriş Başarılı...");
                    return true;
                }
                else{
                    System.out.println("Lütfen Mail aktivasyonunu gerçekleştiriniz");
                    return true;
                }
            }
        }
        System.out.println("Kullanıcı Bulunamadı");
        return false;
    }
}
