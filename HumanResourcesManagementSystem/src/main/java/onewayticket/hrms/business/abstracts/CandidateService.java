package onewayticket.hrms.business.abstracts;

import onewayticket.hrms.core.utilities.results.DataResult;
import onewayticket.hrms.core.utilities.results.Result;
import onewayticket.hrms.entities.concretes.Candidate;
import java.util.List;

public interface CandidateService {
    DataResult<List<Candidate>> getAll();
   // Result add(Candidate candidate);
}
