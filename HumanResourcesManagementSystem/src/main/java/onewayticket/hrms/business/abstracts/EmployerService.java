package onewayticket.hrms.business.abstracts;

import onewayticket.hrms.core.utilities.results.DataResult;
import onewayticket.hrms.core.utilities.results.Result;
import onewayticket.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employer>> getAll();
    // Result add(Employer employer);
}
