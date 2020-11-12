package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.User;
import bt.gov.ditt.dairy.services.UserLocationService;

@RestController
public class UserLocationController {
	
	@Autowired
	private UserLocationService userLocationService;
	
	@RequestMapping(value = "/user-location", method = RequestMethod.GET)
	public List<User> getUserLocation(){
		return userLocationService.getUserLocation();
	}
}
