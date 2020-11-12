package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.GewogLookup;
import bt.gov.ditt.dairy.services.GewogLookupService;

@RestController
public class GewogLookupController {
	
	@Autowired
	private GewogLookupService gewogLookupService;
	
	@GetMapping("/get-village")
	public List<GewogLookup> getGewogs(){
		return gewogLookupService.getGewogs();
	}
	
	@GetMapping("/get-village/{gewog_Serial_No}")
	private GewogLookup getVillageByGewogId(@PathVariable("gewog_Serial_No") int gewog_Serial_No) {
		return gewogLookupService.getVillageByGewogId(gewog_Serial_No);
	}

}
