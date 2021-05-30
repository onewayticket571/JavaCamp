package onewayticket.hrms.business.abstracts;

import onewayticket.hrms.core.utilities.results.DataResult;
import onewayticket.hrms.core.utilities.results.Result;
import onewayticket.hrms.dataAccess.abstracts.PositionDao;
import onewayticket.hrms.entities.concretes.Position;

import java.util.List;

public interface PositionService {
    DataResult<List<Position>> getAll();
    Result add(Position position);

}
