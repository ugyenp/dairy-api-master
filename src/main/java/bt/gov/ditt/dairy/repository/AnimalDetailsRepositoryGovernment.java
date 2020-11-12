package bt.gov.ditt.dairy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.ditt.dairy.model.AnimalDetailsGoverment;
@Repository
public interface AnimalDetailsRepositoryGovernment extends CrudRepository<AnimalDetailsGoverment, String> {

}
