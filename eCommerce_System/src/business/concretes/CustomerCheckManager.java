package business.concretes;

import business.abstracts.CustomerCheckService;
import entities.concretes.Customer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerCheckManager implements CustomerCheckService {
    String eMailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+"[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    String namePattern = "^[\\p{L}A-Z a-z]{2,}$";
    String passwordPattern = "^(?=.[0-9A-Za-z@#$%*?^:;+-._,]).{6,}$";


    @Override
    public boolean checkIfValidEmail(Customer customer) {
        Pattern pattern = Pattern.compile(eMailPattern);
        Matcher matcher = pattern.matcher(customer.geteMail());
        return matcher.matches();
    }

    @Override
    public boolean checkIfValidName(Customer customer) {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcherFirstName = pattern.matcher(customer.getFirstName());
        Matcher matcherLastName = pattern.matcher(customer.getLastName());
        return (matcherFirstName.matches() && matcherLastName.matches());
    }

    @Override
    public boolean checkIfValidPassword(Customer customer) {
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(customer.getPassword());
        return matcher.matches();
    }
}
