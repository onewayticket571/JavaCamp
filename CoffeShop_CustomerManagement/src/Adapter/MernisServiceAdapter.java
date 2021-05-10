package Adapter;

import Abstract.CustomerCheckService;
import Entities.Customer;
import Mernis.KPSPublic;

import java.util.Locale;


public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {

        KPSPublic checkTC = new KPSPublic();
        return checkTC.getKPSPublicSoap().tcKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());




    }
}
