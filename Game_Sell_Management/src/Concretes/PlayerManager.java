package Concretes;

import Abstract.CustomerCheckService;
import Abstract.PlayerManagerService;
import Entities.Player;

public class PlayerManager implements PlayerManagerService {
    private CustomerCheckService customerCheckService;

    public PlayerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void registerPlayer(Player player) {
        if (customerCheckService.checkIfRealPerson(player)){
            System.out.println("Kimlik Doğrulandı."+player.getNickName()+" nickli oyuncu Kaydedildi.");
        }
        else{
            System.out.println("Kimlik doğrulanamadığı için kayıt gerçekleştirilemedi");
        }
    }

    @Override
    public void deletePlayer(Player player) {
        System.out.println(player.getNickName()+" nicki oyuncu silindi ("+player.getFirstName()+" "+player.getLastName()+")");

    }

    @Override
    public void updatePlayer(Player player) {
        System.out.println("Oyuncu bilgileri güncellendi : "+player.getFirstName()+" "+player.getLastName());

    }
}
