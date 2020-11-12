package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.ArtificalInsemination;
import bt.gov.ditt.dairy.repository.ArtificialInseminationRepository;

@Service
public class ArtificialInseminationService {
	
	@Autowired
	private ArtificialInseminationRepository artificialInseminationRepository;

	public ArtificalInsemination getArtificialInseminationDetailsById(String animal_Tag_Number) {
		return artificialInseminationRepository.findById(animal_Tag_Number).get();
	}

	public List<ArtificalInsemination> getArtificialInseminationDetails() {
		List<ArtificalInsemination> artificalInsemination = new ArrayList<>();
		artificialInseminationRepository.findAll().
		forEach(artificalInsemination::add);
		return artificalInsemination;
	}

}
