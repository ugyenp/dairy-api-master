package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.AnimalDetailsFarmer;
import bt.gov.ditt.dairy.services.AnimalDetailsFarmerService;


@RestController
public class AnimalDetailsFarmerController {
	
	@Autowired
	private AnimalDetailsFarmerService animalDetailsFarmerService;
	
	@RequestMapping("/register-farmer-animal")
	public List<AnimalDetailsFarmer> getAllAnimalDetailsForFarmer() {
		return animalDetailsFarmerService.getAllAnimalDetailsForFarmer();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/register-farmer-animal")
	public void addAnimalDetailssForFarmer(@RequestBody AnimalDetailsFarmer animalDetailsFarmer) {
		animalDetailsFarmerService.addAnimalDetailssForFarmer(animalDetailsFarmer);
	}

}
