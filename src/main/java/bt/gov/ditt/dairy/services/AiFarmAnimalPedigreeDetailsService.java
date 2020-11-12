package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.AiFarmAnimalPedigreeDetails;
import bt.gov.ditt.dairy.repository.AiFarmAnimalPedigreeDetailsRepository;

@Service
public class AiFarmAnimalPedigreeDetailsService {

	@Autowired
	private AiFarmAnimalPedigreeDetailsRepository aiFarmAnimalPedigreeDetailsRepository;
	
	public AiFarmAnimalPedigreeDetails getFarmOrFarmerAnimalPedegreeDetails(String animalTagNumber) {
		 AiFarmAnimalPedigreeDetails aiFarmAnimalPedigreeDetails = aiFarmAnimalPedigreeDetailsRepository.findById(animalTagNumber).get(); 
		 return aiFarmAnimalPedigreeDetails;
		
	}

	public List<AiFarmAnimalPedigreeDetails> getFarmOrFarmerAnimalPedegreeDetails() {
		List<AiFarmAnimalPedigreeDetails> aiFarmAnimalPedigreeDetails = new ArrayList<>();
		aiFarmAnimalPedigreeDetailsRepository.findAll().
		forEach(aiFarmAnimalPedigreeDetails::add);
		return aiFarmAnimalPedigreeDetails;
	}

}
