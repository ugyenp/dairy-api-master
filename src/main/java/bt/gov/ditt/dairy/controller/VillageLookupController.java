package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.VillageLookup;
import bt.gov.ditt.dairy.services.VillageLookupService;

@RestController
public class VillageLookupController {
	
	@Autowired
	private VillageLookupService villageLookupService;
	
	@RequestMapping(value = "/villages")
	public List<VillageLookup> getAllVillages(){
		return villageLookupService.getAllVillages();
	}

}
