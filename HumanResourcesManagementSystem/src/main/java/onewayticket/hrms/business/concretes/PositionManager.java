package onewayticket.hrms.business.concretes;

import onewayticket.hrms.business.abstracts.PositionService;
import onewayticket.hrms.core.utilities.results.DataResult;
import onewayticket.hrms.core.utilities.results.Result;
import onewayticket.hrms.core.utilities.results.SuccessDataResult;
import onewayticket.hrms.dataAccess.abstracts.PositionDao;
import onewayticket.hrms.entities.concretes.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionManager implements PositionService {
    private PositionDao positionDao;

    @Autowired
    public PositionManager(PositionDao positionDao) {
        this.positionDao = positionDao;
    }

    @Override
    public DataResult<List<Position>> getAll() {
        return new SuccessDataResult<List<Position>>(this.positionDao.findAll(),"Data Listelendi");
    }


    @Override
    public Result add(Position position) {
        this.positionDao.save(position);
        return new SuccessDataResult("Pozisyon eklendi.");
    }

}
