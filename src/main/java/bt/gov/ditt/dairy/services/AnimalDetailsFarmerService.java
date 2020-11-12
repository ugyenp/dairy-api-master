package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.AnimalDetailsFarmer;
import bt.gov.ditt.dairy.repository.AnimalDetailsRepositoryFarmer;

@Service
public class AnimalDetailsFarmerService {

	@Autowired
	private AnimalDetailsRepositoryFarmer animalDetailsFarmerRepository;
	
	public List<AnimalDetailsFarmer> getAllAnimalDetailsForFarmer() {
		List<AnimalDetailsFarmer> animalDetailsFarmer = new ArrayList<>();
		animalDetailsFarmerRepository.findAll().
		forEach(animalDetailsFarmer::add);
		return animalDetailsFarmer;
	}

	public void addAnimalDetailssForFarmer(AnimalDetailsFarmer animalDetailsFarmer) {
		animalDetailsFarmerRepository.save(animalDetailsFarmer);
		
	}

}
