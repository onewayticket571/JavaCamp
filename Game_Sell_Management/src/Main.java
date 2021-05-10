import Abstract.PlayerManagerService;
import Adapter.MernisCustomerCheckManager;
import Concretes.PlayerManager;
import Concretes.ProductManager;
import Entities.Campaign;
import Entities.Player;
import Entities.Product;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Doğru Kişi bilgilerini girerek deneyiniz
        Player player1 = new Player("OneWayTicket","Mehmet","YILMAZ",35824930494L, LocalDate.of(1900,1,1));
        Product product1 = new Product(1,"Age of Empires IV","Game",35.95);
        Product product2 = new Product(2,"Tomb Raider","Game",75.10);
        Campaign campaign1 = new Campaign("Bahar Fırsatı",15);
        ProductManager productManager = new ProductManager();

        PlayerManagerService playerManagerService = new PlayerManager(new MernisCustomerCheckManager());
        playerManagerService.registerPlayer(player1);
        System.out.println("--------------------");

        productManager.sell(product1,player1);
        System.out.println("--------------------");
        productManager.sell(product2,player1,campaign1);
        System.out.println("--------------------");

        System.out.println("Sahip olunan oyunlar:");
        for (Product product:player1.getProductsOwned()){
            System.out.println(product.getProductName());
        }



    }


}

