package bt.gov.ditt.dairy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.ditt.dairy.model.ApplicationSequence;

@Repository
public interface ApplicationSequenceRepository extends CrudRepository<ApplicationSequence, Integer> {

	//String save(int lastApplicationNumber);
	

}
