package bt.gov.ditt.dairy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import bt.gov.ditt.dairy.model.ApplicationSequence;
import bt.gov.ditt.dairy.repository.ApplicationSequenceRepository;
@Service
public class ApplicationSequenceService {
	@Autowired
	private ApplicationSequenceRepository applicationSequenceRepository;

	public ApplicationSequence getApplicationSequencById(int serviceId) {
		ApplicationSequence data =  applicationSequenceRepository.findById(serviceId).get(); 
		int nextApplicationNo = data.getLastApplicationNumber() + 1;
		
		data.setLastApplicationNumber(nextApplicationNo);
		applicationSequenceRepository.save(data);
		
		return data;
	}


}
