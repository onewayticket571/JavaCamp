package onewayticket.hrms.business.concretes;

import onewayticket.hrms.business.abstracts.EmployerService;
import onewayticket.hrms.core.utilities.results.DataResult;
import onewayticket.hrms.core.utilities.results.Result;
import onewayticket.hrms.core.utilities.results.SuccessDataResult;
import onewayticket.hrms.core.utilities.results.SuccessResult;
import onewayticket.hrms.dataAccess.abstracts.EmployerDao;
import onewayticket.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao){
        this.employerDao = employerDao;
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(this.employerDao.findAll(),"İşverenler Listelendi");
    }

   /*
    @Override
    public Result add(Employer employer) {
        this.employerDao.save(employer);
        return new SuccessResult("İşveren eklendi");
    }

    */
}
