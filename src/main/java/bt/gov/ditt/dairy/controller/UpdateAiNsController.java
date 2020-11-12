package bt.gov.ditt.dairy.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.UpdateAiNs;
import bt.gov.ditt.dairy.services.UpdateAiNsService;

@RestController
public class UpdateAiNsController {

	@Autowired
	private UpdateAiNsService updateAiNsService;
	
	@RequestMapping(value="/get-ai/{Animal_Tag_Number}", method = RequestMethod.GET)
	private UpdateAiNs getAiDetailsById(@PathVariable("Animal_Tag_Number") String Animal_Tag_Number) {
		return updateAiNsService.getAiDetailsById(Animal_Tag_Number);
	}
	
	@PostMapping("/update-ai/{Animal_Tag_Number}")
	private Optional<Object> updateAiDetails(@RequestBody UpdateAiNs updateAiNs, @PathVariable  ("Animal_Tag_Number") String Animal_Tag_Number) {
		return updateAiNsService.updateAiDetails(updateAiNs,Animal_Tag_Number);
	}
	
	
}
