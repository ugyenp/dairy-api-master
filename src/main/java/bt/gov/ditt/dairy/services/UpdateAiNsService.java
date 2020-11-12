package bt.gov.ditt.dairy.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import bt.gov.ditt.dairy.model.UpdateAiNs;
import bt.gov.ditt.dairy.repository.AiNsUpdateRepository;

@Service
public class UpdateAiNsService {

	@Autowired
	private AiNsUpdateRepository aiNsUpdateRepository;
	
	public UpdateAiNs getAiDetailsById(String animal_Tag_Number) {
		UpdateAiNs updateAiNs = aiNsUpdateRepository.findById(animal_Tag_Number).get();
		return updateAiNs;
	}

	
	public Optional<Object> updateAiDetails(UpdateAiNs updateAiNs,String animal_Tag_Number)  {
		return aiNsUpdateRepository.findById(animal_Tag_Number).map(x -> {
			x.setBull_Number(updateAiNs.getBull_Number());
			x.setBull_Name(updateAiNs.getBull_Name());
			x.setDate_Of_Event(updateAiNs.getDate_Of_Event());
			x.setSemen_Type(updateAiNs.getSemen_Type());
			return aiNsUpdateRepository.save(x);
		});
	}



}
