package bt.gov.ditt.dairy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.ditt.dairy.model.AiNsAudit;

@Repository
public interface AiNsAuditRepository extends CrudRepository<AiNsAudit, Integer> {

}
