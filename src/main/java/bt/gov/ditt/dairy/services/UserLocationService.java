package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.User;
import bt.gov.ditt.dairy.repository.UserLocationRepository;

@Service
public class UserLocationService {

	@Autowired
	private UserLocationRepository userLocationRepository;
	public List<User> getUserLocation() {
		
		List<User> user = new ArrayList<>();
		userLocationRepository.findAll().forEach(user::add);
		return user;
		
	}

}
