package onewayticket.hrms.entities.concretes;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int userId;

    @Column(name = "email")
    private String eMail;

    @Column(name = "password")
    private String password;

    @Column(name = "activation_status")
    private boolean activationStatus;

    public User(){}

    public User(String eMail, String password) {
        this.eMail = eMail;
        this.password = password;
    }

}
