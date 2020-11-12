package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import bt.gov.ditt.dairy.model.AnimalDetailsGoverment;
import bt.gov.ditt.dairy.services.AnimalDetailsGovernmentService;

@RestController
public class AnimalDetailsGovernmentController {
	@Autowired
	private AnimalDetailsGovernmentService animalDetailsGovernmentService;
	
	@RequestMapping("/register-govt-animal")
	public List<AnimalDetailsGoverment> getAllAnimalDetailsForGivernment() {
		return animalDetailsGovernmentService.getAllAnimalDetailsForGivernment();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/register-govt-animal")
	public void addAnimalDetailsForGovernment(@RequestBody AnimalDetailsGoverment animalDetailsGoverment) {
		animalDetailsGovernmentService.addAnimalDetailsForGovernment(animalDetailsGoverment);
	}
}
