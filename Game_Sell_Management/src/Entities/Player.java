package Entities;

import Abstract.Entities;
import java.time.LocalDate;
import java.util.ArrayList;

public class Player  implements Entities {
    private String nickName;
    private String firstName;
    private String lastName;
    private long nationalIdentity;
    private LocalDate birthdate;
    private ArrayList<Product> productsOwned = new ArrayList<Product>();

    public Player(String nickName, String firstName, String lastName, long nationalIdentity, LocalDate birthdate) {
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentity = nationalIdentity;
        this.birthdate = birthdate;
    }

    public String getNickName() {
        return nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getNationalIdentity() {
        return nationalIdentity;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public ArrayList<Product> getProductsOwned() {
        return productsOwned;
    }

    public void setProductsOwned(Product product) {
        this.productsOwned.add(product);
    }
}
