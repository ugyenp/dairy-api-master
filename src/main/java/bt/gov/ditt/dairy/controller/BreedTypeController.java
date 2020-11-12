package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.BreedType;
import bt.gov.ditt.dairy.services.BreedTypeService;

@RestController
public class BreedTypeController {

	@Autowired
	private BreedTypeService breedTypeService;
	
	@GetMapping("/breed-type")
	public List<BreedType> getAllBreedType(){
		return breedTypeService.getAllBreedType();
	}
	
	@GetMapping("/breed-type/{breedId}")
	private BreedType getBreedById(@PathVariable("breedId") int breedId)   
	{  
		BreedType breedType =  breedTypeService.getBreedById(breedId);
		return breedType;
	}  
}
