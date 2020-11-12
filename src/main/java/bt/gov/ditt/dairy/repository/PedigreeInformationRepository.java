package bt.gov.ditt.dairy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.ditt.dairy.model.PedigreeInformation;

@Repository
public interface PedigreeInformationRepository extends CrudRepository<PedigreeInformation,String> {

	Iterable<PedigreeInformation> findAll();
}
