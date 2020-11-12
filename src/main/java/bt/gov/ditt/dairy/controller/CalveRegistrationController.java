package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.CalveRegistration;
import bt.gov.ditt.dairy.services.CalveRegistrationService;

@RestController
public class CalveRegistrationController {
	
	@Autowired
	private CalveRegistrationService calveRegistrationService;
	
	@RequestMapping(value = "/register-calve", method = RequestMethod.POST)
	public Object registerCalve(@RequestBody CalveRegistration calveRegistration) {
		return calveRegistrationService.registerCalve(calveRegistration);
	}
	
	@GetMapping("/register-calve")
	public List<CalveRegistration> getCalveRegistration(){
		return calveRegistrationService.getCalveRegistration();
	}

}
