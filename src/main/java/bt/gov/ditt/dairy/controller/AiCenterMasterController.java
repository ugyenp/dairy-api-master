package bt.gov.ditt.dairy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.AiCenterMaster;
import bt.gov.ditt.dairy.services.AiCenterMasterService;


@RestController
public class AiCenterMasterController {
	
	@Autowired
	private AiCenterMasterService aiCenterMasterService;
	
	@GetMapping( "/ai-center")
	public List<AiCenterMaster> getAllAiCenter(){
		return aiCenterMasterService.getAllAiCenter();
	}

}
