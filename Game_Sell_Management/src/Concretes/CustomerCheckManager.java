package Concretes;

import Abstract.CustomerCheckService;
import Entities.Player;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        //TC Kimlik Fake Test ortamı
        return true;
    }
}
