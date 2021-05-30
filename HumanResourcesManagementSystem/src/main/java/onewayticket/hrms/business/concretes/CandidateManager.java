package onewayticket.hrms.business.concretes;

import onewayticket.hrms.business.abstracts.CandidateService;
import onewayticket.hrms.core.utilities.results.DataResult;
import onewayticket.hrms.core.utilities.results.Result;
import onewayticket.hrms.core.utilities.results.SuccessDataResult;
import onewayticket.hrms.core.utilities.results.SuccessResult;
import onewayticket.hrms.dataAccess.abstracts.CandidateDao;
import onewayticket.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {
   private CandidateDao candidateDao;

   @Autowired
   public CandidateManager(CandidateDao candidateDao){
       this.candidateDao = candidateDao;
   }


    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<>(this.candidateDao.findAll(),"İş arayanlar listelendi");
    }

    /*
    @Override
    public Result add(Candidate candidate){
       return new SuccessResult("İş arayan eklendi");
    }

     */
}
