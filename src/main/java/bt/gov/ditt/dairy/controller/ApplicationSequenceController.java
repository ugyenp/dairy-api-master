package bt.gov.ditt.dairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import bt.gov.ditt.dairy.services.ApplicationSequenceService;
import bt.gov.ditt.dairy.model.ApplicationSequence;

@RestController
public class ApplicationSequenceController {
	
	@Autowired
	private ApplicationSequenceService applicationSequenceService;
	
	
	@GetMapping("/application-sequence/{serviceId}")  
	private ApplicationSequence getApplicationSequencById(@PathVariable("serviceId") int serviceId)   
	{  
		ApplicationSequence applicationNo =  applicationSequenceService.getApplicationSequencById(serviceId);
		return applicationNo;
	}  
	
}
