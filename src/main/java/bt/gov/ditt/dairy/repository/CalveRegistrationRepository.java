package bt.gov.ditt.dairy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.ditt.dairy.model.CalveRegistration;

@Repository
public interface CalveRegistrationRepository extends CrudRepository<CalveRegistration, String> {

}
