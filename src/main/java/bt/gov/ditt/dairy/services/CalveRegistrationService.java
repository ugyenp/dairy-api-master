package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.CalveRegistration;
import bt.gov.ditt.dairy.repository.CalveRegistrationRepository;

@Service
public class CalveRegistrationService {
	
	@Autowired
	private CalveRegistrationRepository calveRegistrationRepository;

	public Object registerCalve(CalveRegistration calveRegistration) {
		// TODO Auto-generated method stub
		return calveRegistrationRepository.save(calveRegistration);
	}

	public List<CalveRegistration> getCalveRegistration() {
		List<CalveRegistration> calveRegistration = new ArrayList<>();
		calveRegistrationRepository.findAll().forEach(calveRegistration::add);
		return calveRegistration;
	}

}
