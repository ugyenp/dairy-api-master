package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bt.gov.ditt.dairy.model.PedigreeInformation;
import bt.gov.ditt.dairy.repository.PedigreeInformationRepository;

@Service
public class PedigreeInformationService {

	@Autowired
	private PedigreeInformationRepository pedigreeInformationRepository;
	
	public List<PedigreeInformation> getPedigreeInformation() {
		List<PedigreeInformation> pedigreeInformation = new ArrayList<>();
		pedigreeInformationRepository.findAll().
		forEach(pedigreeInformation::add);
		return pedigreeInformation;
	}

	public PedigreeInformation getPedigreeInformationByTagg(String animalTaggNumber) {
		PedigreeInformation result = pedigreeInformationRepository.findById(animalTaggNumber).get();
		return result;
		
	}

}
