package bt.gov.ditt.dairy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.ditt.dairy.model.ExotiocBloodMaster;

@Repository
public interface ExoticBloodMasterRepository extends CrudRepository<ExotiocBloodMaster, Integer> {
	
//	@Query("select e.Exotic_Blood from exotic_blood_master e ")
//	List<ExotiocBloodMaster> findByExoticBlood();
}
