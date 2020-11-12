package bt.gov.ditt.dairy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.AiNs;
import bt.gov.ditt.dairy.repository.AiNsRepository;

@Service
public class AiNsService {

	@Autowired
	private AiNsRepository aiNsRepository;
	
	
	public AiNs getAiNsDetailsByTag(String animal_Tag_Number) {
		return aiNsRepository.findById(animal_Tag_Number).get();
	}
	
	public void addAiDetails(AiNs aiNs) {
	  aiNsRepository.save(aiNs);
	}

}
