package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.OwneDetailsFarmer;
import bt.gov.ditt.dairy.repository.OwnerDetailsFarmerRepository;

@Service
public class OwnerDetailsServices {
	
	@Autowired
	private OwnerDetailsFarmerRepository ownerDetailsFarmerRepository;
	
	public List<OwneDetailsFarmer> getAllFarmersDetail() {
		List<OwneDetailsFarmer> ownerDetailsFarmer = new ArrayList<>();
		ownerDetailsFarmerRepository.findAll().
		forEach(ownerDetailsFarmer::add);
		return ownerDetailsFarmer;
	}
}
