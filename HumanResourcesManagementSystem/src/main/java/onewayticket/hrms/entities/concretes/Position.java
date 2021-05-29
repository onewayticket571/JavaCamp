package onewayticket.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "positions")
public class Position {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int positionId;

    @Column(name = "position_name")
    private String positionName;

    public Position(){ }

    public Position(String positionName) {
        this.positionName = positionName;
    }

}
