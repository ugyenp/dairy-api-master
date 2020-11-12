package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.AiNsAudit;
import bt.gov.ditt.dairy.repository.AiNsAuditRepository;

@Service
public class AiNsAuditService {

	@Autowired
	private AiNsAuditRepository aiNsAuditRepository;
	
	public AiNsAudit updateAuditTable(AiNsAudit aiNsAudit) {
		return aiNsAuditRepository.save(aiNsAudit);
	}

	public List<AiNsAudit> getAuditTable() {
		List<AiNsAudit> aiNsAudit = new ArrayList<>();
		aiNsAuditRepository.findAll().
		forEach(aiNsAudit::add);
		return aiNsAudit;
	}

}
