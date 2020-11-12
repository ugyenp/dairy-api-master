package bt.gov.ditt.dairy.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.ExotiocBloodMaster;
import bt.gov.ditt.dairy.services.ExoticBloodMasterService;

@RestController
public class ExoticBloodMasterController {
	
	@Autowired
	private ExoticBloodMasterService exoticBloodMasterService;
	
	@RequestMapping(value="/exotic-blood", method = RequestMethod.GET)
	public Iterable<ExotiocBloodMaster> getExoticBloodpercent() {
		Iterable<ExotiocBloodMaster> exotiocBloodMaster = exoticBloodMasterService.getExoticBloodpercent();
		return exotiocBloodMaster;
	}

}
