package onewayticket.hrms.dataAccess.abstracts;

import onewayticket.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate , Integer> {
}
