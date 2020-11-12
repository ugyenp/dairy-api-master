package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.BreedType;
import bt.gov.ditt.dairy.repository.BreedTypeRepository;

@Service
public class BreedTypeService {
	
	@Autowired
	private BreedTypeRepository breedTypeRepository;

	public List<BreedType> getAllBreedType() {
		List<BreedType> breedType = new ArrayList<>();
		breedTypeRepository.findAll().
		forEach(breedType::add);
		return breedType;
	}

	public BreedType getBreedById(int breedId) {
		BreedType data = breedTypeRepository.findById(breedId).get();
		return data;
	}
	
	

}
