package onewayticket.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "staff")
public class Staff extends User{

    @Column(name = "staff_first_name")
    private String firstName;

    @Column(name = "staff_last_name")
    private String lastName;

    public Staff(){}

    public Staff(String eMail, String password, String firstName, String lastName) {
        super(eMail, password);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
