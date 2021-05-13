import business.abstracts.CustomerService;
import business.abstracts.LoginService;
import business.concretes.CustomerCheckManager;
import business.concretes.CustomerManager;
import business.concretes.LoginManager;
import core.concretes.GoogleAuthManagerAdapter;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Customer;

public class Main {

    public static void main(String[] args) {

        //Sisteme kullanıcı kaydetme TEST
        Customer customer1 = new Customer("Ali","MERT","ali.mert@gmail.com","789456");
        CustomerService customerService = new CustomerManager(new HibernateProductDao(),new CustomerCheckManager());
        customerService.addCustomer(customer1);

        System.out.println("-----------------------------");


        // Sisteme giriş TEST
        // Hem e-mail ile hem de google ile giriş simülasyonu ayrı ayrı
        //LoginService loginService = new LoginManager(new HibernateProductDao());
        LoginService loginService = new GoogleAuthManagerAdapter();
        loginService.login("ayse1@gmail.com","123456");





















    }
}
