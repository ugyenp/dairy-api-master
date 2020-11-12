package bt.gov.ditt.dairy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.GovernmentFarmDetails;
import bt.gov.ditt.dairy.services.GovernmentFarmDetailsService;

@RestController
public class GovernmentFarmDetailsController {
	
	@Autowired
	private GovernmentFarmDetailsService governmentFarmDetailsService;
	
	@RequestMapping(value="/govt-farm-details/{nlhdNumber}")
	public GovernmentFarmDetails getGovtFarmDetailsFromNlhd(@PathVariable("nlhdNumber") String nlhdNumber) {
		return governmentFarmDetailsService.getGovtFarmDetailsFromNlhd(nlhdNumber);
	}
}
