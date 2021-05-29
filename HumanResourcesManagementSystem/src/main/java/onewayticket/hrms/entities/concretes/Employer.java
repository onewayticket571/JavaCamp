package onewayticket.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "employers")
public class Employer extends User{

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_site")
    private String webSite;

    @Column(name = "phone")
    private String phoneNumber;

    public Employer() {}

    public Employer(String eMail, String password, String companyName, String webSite, String phoneNumber) {
        super(eMail, password);
        this.companyName = companyName;
        this.webSite = webSite;
        this.phoneNumber = phoneNumber;
    }
}
