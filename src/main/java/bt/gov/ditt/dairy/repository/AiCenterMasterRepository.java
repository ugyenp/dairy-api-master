package bt.gov.ditt.dairy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.ditt.dairy.model.AiCenterMaster;

@Repository
public interface AiCenterMasterRepository extends CrudRepository<AiCenterMaster, Integer> {

}
