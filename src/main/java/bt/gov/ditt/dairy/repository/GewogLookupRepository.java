package bt.gov.ditt.dairy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.ditt.dairy.model.GewogLookup;

@Repository
public interface GewogLookupRepository extends CrudRepository<GewogLookup, Integer>{

}
