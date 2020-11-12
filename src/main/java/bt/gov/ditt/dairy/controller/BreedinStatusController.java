package bt.gov.ditt.dairy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.BreedingStatus;
import bt.gov.ditt.dairy.services.BreedingStatusService;

@RestController
public class BreedinStatusController {
	
	@Autowired
	private BreedingStatusService breedingStatusService;
	

	@RequestMapping("/get-breeding-status")
	public List<BreedingStatus> getBreedinStatus(){
		return breedingStatusService.getBreedinStatus();
	}
	
	@PostMapping("/get-breeding-status/{Animal_Tag_Number}")
	private Optional<Object> updateBreedingStatus(@RequestBody BreedingStatus breedingStatus, @PathVariable  ("Animal_Tag_Number") String Animal_Tag_Number) {
		return breedingStatusService.updateAiDetails(breedingStatus, Animal_Tag_Number);
	}
	
}
