package bt.gov.ditt.dairy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import bt.gov.ditt.dairy.model.BreedType;

@Repository
public interface BreedTypeRepository extends CrudRepository<BreedType,Integer> {
 //public List<BreedType> findBreedTypes(String breedType);
}
