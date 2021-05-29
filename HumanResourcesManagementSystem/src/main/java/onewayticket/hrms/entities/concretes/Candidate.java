package onewayticket.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "candidates")
public class Candidate extends User{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "nationality_identity")
    private String nationalityIdentity;

    @Column(name = "birthdate")
    private short birthDate;

    public Candidate(){}

    public Candidate( String eMail, String password, String firstName, String lastName, String nationalityIdentity, short birthDate) {
        super(eMail, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityIdentity = nationalityIdentity;
        this.birthDate = birthDate;
    }
}
