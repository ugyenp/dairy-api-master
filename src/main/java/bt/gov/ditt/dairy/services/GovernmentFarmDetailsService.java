package bt.gov.ditt.dairy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.GovernmentFarmDetails;
import bt.gov.ditt.dairy.repository.GovernmantFarmDetailsRepository;

@Service
public class GovernmentFarmDetailsService {

	@Autowired
	private GovernmantFarmDetailsRepository governmantFarmDetailsRepository;
	
	
	public GovernmentFarmDetails getGovtFarmDetailsFromNlhd(String nlhdNumber) {
		return governmantFarmDetailsRepository.findById(nlhdNumber).get();  
	}

}
