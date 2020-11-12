package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.GewogLookup;
import bt.gov.ditt.dairy.repository.GewogLookupRepository;

@Service
public class GewogLookupService {
	
	@Autowired
	private GewogLookupRepository gewogLookupRepository;

	public List<GewogLookup> getGewogs() {
		List<GewogLookup> gewogLookup = new ArrayList<>();
		gewogLookupRepository.findAll().forEach(gewogLookup::add);
		return gewogLookup;
	}

	public GewogLookup getVillageByGewogId(int gewog_Serial_No) {
		GewogLookup gewogLookup = gewogLookupRepository.findById(gewog_Serial_No).get();
		return gewogLookup;
	}

}
