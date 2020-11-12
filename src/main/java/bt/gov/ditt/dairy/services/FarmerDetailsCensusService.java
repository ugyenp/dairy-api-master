package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.FarmerDetailCensus;
import bt.gov.ditt.dairy.repository.FarmerDetailsCensusRepository;

@Service
public class FarmerDetailsCensusService {
	
	@Autowired
	private FarmerDetailsCensusRepository farmerDetailsCensusRepository;

	public List<FarmerDetailCensus> getAllFarmersDetailFromCensusApi() {
		List<FarmerDetailCensus> farmerDetailCensus = new ArrayList<>();
		farmerDetailsCensusRepository.findAll().
		forEach(farmerDetailCensus::add);
		return farmerDetailCensus;
	}

	public FarmerDetailCensus getFarmerDetailsFromCid(String cid_number) {
		return farmerDetailsCensusRepository.findById(cid_number).get();  
	}

}
