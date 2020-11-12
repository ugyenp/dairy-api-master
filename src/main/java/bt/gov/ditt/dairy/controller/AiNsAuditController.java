package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.AiNsAudit;
import bt.gov.ditt.dairy.services.AiNsAuditService;

@RestController
public class AiNsAuditController {
	
	@Autowired
	private AiNsAuditService aiNsAuditService;
	
	@RequestMapping(value = "/update-audit", method = RequestMethod.POST)
	private AiNsAudit updateAuditTable(@RequestBody AiNsAudit aiNsAudit) {
		return aiNsAuditService.updateAuditTable(aiNsAudit);
	}
	
	@RequestMapping(value = "/get-audit", method = RequestMethod.GET)
	public List<AiNsAudit> getAuditTable() {
		return aiNsAuditService.getAuditTable();
	}


}
