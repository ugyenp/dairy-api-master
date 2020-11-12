package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.BreedingStatus;
import bt.gov.ditt.dairy.repository.BreedingStatusRepository;

@Service
public class BreedingStatusService {
	
	@Autowired
	private BreedingStatusRepository breedingStatusRepository;

	public List<BreedingStatus> getBreedinStatus() {
		List<BreedingStatus> breedingStatus = new ArrayList<>();
		breedingStatusRepository.findAll().forEach(breedingStatus::add);
		return breedingStatus;
	}

	public Optional<Object> updateAiDetails(BreedingStatus breedingStatus, String animal_Tag_Number) {
		return breedingStatusRepository.findById(animal_Tag_Number).map(x -> {
			x.setBreeding_Status(breedingStatus.getBreeding_Status());
			x.setPD_Status(breedingStatus.getPD_Status());
			x.setPD_Status_Date(breedingStatus.getPD_Status_Date());
			return breedingStatusRepository.save(x);
		});
	}

}
