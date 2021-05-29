package onewayticket.hrms.business.abstracts;

import onewayticket.hrms.entities.concretes.Position;

import java.util.List;

public interface PositionService {
    List<Position> getAll();
}
