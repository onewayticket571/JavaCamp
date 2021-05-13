package business.concretes;

import business.abstracts.ActivationService;
import entities.concretes.Customer;

public class EmailActivationManager implements ActivationService {

    @Override
    public void activater(Customer customer) {
        //Deneme simülasyon, Aktivasyon gerçekleştirildi.
        customer.setActivationStatus(true);

    }
}
