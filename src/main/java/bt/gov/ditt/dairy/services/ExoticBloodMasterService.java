package bt.gov.ditt.dairy.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.ExotiocBloodMaster;
import bt.gov.ditt.dairy.repository.ExoticBloodMasterRepository;

@Service
public class ExoticBloodMasterService {

	@Autowired
	private ExoticBloodMasterRepository exoticBloodMasterRepository;
	
//	public Iterable<ExotiocBloodMaster> getExoticBloodpercent() {
//		Iterable<ExotiocBloodMaster> exotiocBloodMaster = exoticBloodMasterRepository.findByExoticBlood();
//		return exotiocBloodMaster;
//	}

	@Transactional
	public Iterable<ExotiocBloodMaster> getExoticBloodpercent() {
		Iterable<ExotiocBloodMaster> exotiocBloodMaster = exoticBloodMasterRepository.findAll();
		return exotiocBloodMaster;
	}

}
