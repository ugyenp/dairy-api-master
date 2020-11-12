package bt.gov.ditt.dairy.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.OwneDetailsFarmer;
import bt.gov.ditt.dairy.services.OwnerDetailsServices;


@RestController
public class OwnerDetailsController {
	@Autowired
	private OwnerDetailsServices OwnerDetailsServices;
	
	@RequestMapping("/farmers")
	public List<OwneDetailsFarmer> getAllFarmersDetail() {
		return OwnerDetailsServices.getAllFarmersDetail();
	}

}
