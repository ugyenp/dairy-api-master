package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.VillageLookup;
import bt.gov.ditt.dairy.repository.VillageLookupRepository;

@Service
public class VillageLookupService {
	
	@Autowired
	private VillageLookupRepository villageLookupRepository;

	public List<VillageLookup> getAllVillages() {
		List<VillageLookup> villageLookup = new ArrayList<>();
		villageLookupRepository.findAll().forEach(villageLookup::add);
		return villageLookup;
	}

}
