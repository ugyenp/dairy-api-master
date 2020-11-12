package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.AiFarmAnimalPedigreeDetails;
import bt.gov.ditt.dairy.services.AiFarmAnimalPedigreeDetailsService;

@RestController
public class AiFarmAnimalPedigreeDetailsController {

	@Autowired
	private AiFarmAnimalPedigreeDetailsService aiFarmAnimalPedigreeDetailsService;
	
	@RequestMapping(value="/ai-animal-details/{animalTagNumber}", method = RequestMethod.GET)
	public AiFarmAnimalPedigreeDetails getFarmOrFarmerAnimalPedegreeDetails(@PathVariable("animalTagNumber") String animalTagNumber) {
		return aiFarmAnimalPedigreeDetailsService.getFarmOrFarmerAnimalPedegreeDetails(animalTagNumber);
	}
	@RequestMapping(value="/ai-animal-details", method = RequestMethod.GET)
	public List<AiFarmAnimalPedigreeDetails> getAllFarmOrFarmerAnimalPedegreeDetails() {
		return aiFarmAnimalPedigreeDetailsService.getFarmOrFarmerAnimalPedegreeDetails();
	}
}
