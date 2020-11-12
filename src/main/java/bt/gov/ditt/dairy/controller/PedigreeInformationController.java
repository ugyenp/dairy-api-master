package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.PedigreeInformation;
import bt.gov.ditt.dairy.services.PedigreeInformationService;

@RestController
public class PedigreeInformationController {
	@Autowired
	private PedigreeInformationService pedigreeInformationService;
	
	@RequestMapping("/pedigree-information")
	public List<PedigreeInformation> getPedigreeInformation() {
		return pedigreeInformationService.getPedigreeInformation();
	}
	

	@RequestMapping(value="/pedigree-information/{animalTaggNumber}")
	public PedigreeInformation getPedigreeInformationByTagg(@PathVariable("animalTaggNumber") String animalTaggNumber) {
		return pedigreeInformationService.getPedigreeInformationByTagg(animalTaggNumber);
	}
}
