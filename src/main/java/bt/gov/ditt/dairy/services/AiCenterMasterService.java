package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.AiCenterMaster;
import bt.gov.ditt.dairy.repository.AiCenterMasterRepository;

@Service
public class AiCenterMasterService {

	@Autowired
	private AiCenterMasterRepository aiCenterMasterRepository;
	
	public List<AiCenterMaster> getAllAiCenter() {
		List<AiCenterMaster> aiCenterMaster = new ArrayList<>();
		aiCenterMasterRepository.findAll().forEach(aiCenterMaster::add);
		return aiCenterMaster;
	}

}
