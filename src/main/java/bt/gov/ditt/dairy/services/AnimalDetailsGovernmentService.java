package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.AnimalDetailsGoverment;
import bt.gov.ditt.dairy.repository.AnimalDetailsRepositoryGovernment;

@Service
public class AnimalDetailsGovernmentService {

	@Autowired
	private AnimalDetailsRepositoryGovernment animalDetailsRepositoryGovernment;
	
	public List<AnimalDetailsGoverment> getAllAnimalDetailsForGivernment() {
		List<AnimalDetailsGoverment> animalDetailsGoverment = new ArrayList<>();
		animalDetailsRepositoryGovernment.findAll().
		forEach(animalDetailsGoverment::add);
		return animalDetailsGoverment;
	}

	public void addAnimalDetailsForGovernment(AnimalDetailsGoverment animalDetailsGoverment) {
		animalDetailsRepositoryGovernment.save(animalDetailsGoverment);
		
	}

}
