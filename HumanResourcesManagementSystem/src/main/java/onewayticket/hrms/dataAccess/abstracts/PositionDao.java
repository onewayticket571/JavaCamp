package onewayticket.hrms.dataAccess.abstracts;

import onewayticket.hrms.entities.concretes.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionDao extends JpaRepository<Position , Integer> {

}
