package Adapter;

import Abstract.CustomerCheckService;
import Entities.Player;
import Mernis.KPSPublic;

public class MernisCustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        KPSPublic tcCheck = new KPSPublic();
        return tcCheck.getKPSPublicSoap().tcKimlikNoDogrula(player.getNationalIdentity(), player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.getBirthdate().getYear());
    }
}
