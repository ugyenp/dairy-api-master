package bt.gov.ditt.dairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.AiNs;
import bt.gov.ditt.dairy.services.AiNsService;

@RestController
public class AiNsController {
	
	@Autowired
	private AiNsService aiNsService;  
	
	@RequestMapping(value = "/ains/{Animal_Tag_Number}", method = RequestMethod.GET)
	private AiNs getAiNsDetailsByTag(@PathVariable("Animal_Tag_Number") String Animal_Tag_Number) {
		return aiNsService.getAiNsDetailsByTag(Animal_Tag_Number);
	}
	
	@RequestMapping(value = "/ains", method = RequestMethod.POST)
	public void addAiDetails(@RequestBody AiNs aiNs) {
	  aiNsService.addAiDetails(aiNs);
	}

}
