package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.ArtificalInsemination;
import bt.gov.ditt.dairy.services.ArtificialInseminationService;

@RestController
public class ArtificialinseminationController {
	
	@Autowired
	private ArtificialInseminationService artificialInseminationService;
	
	@GetMapping("/artificial-insemination/{Animal_Tag_Number}")
	private ArtificalInsemination getArtificialInseminationDetailsById(@PathVariable("Animal_Tag_Number") String Animal_Tag_Number) {
		ArtificalInsemination artificalInsemination = artificialInseminationService.getArtificialInseminationDetailsById(Animal_Tag_Number);
		return artificalInsemination;
	} 
	
	@GetMapping("/artificial-insemination")
	private List<ArtificalInsemination> getArtificialInseminationDetails() {
		List<ArtificalInsemination> artificalInsemination = artificialInseminationService.getArtificialInseminationDetails();
		return artificalInsemination;
	} 


}
