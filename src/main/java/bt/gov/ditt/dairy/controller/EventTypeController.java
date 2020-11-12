package bt.gov.ditt.dairy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bt.gov.ditt.dairy.model.EventType;
import bt.gov.ditt.dairy.services.EventTypeService;

@RestController
public class EventTypeController {
	
	@Autowired
	private EventTypeService eventTypeService;
	
	@GetMapping("/even-type")
	public List<EventType> getEvents(){
		return eventTypeService.getEvents();
	}
	
	@PostMapping("/even-type/{Animal_Tag_Number}")
	private Optional<Object> updateAiDetails(@RequestBody EventType eventType, @PathVariable  ("Animal_Tag_Number") String Animal_Tag_Number) {
		return eventTypeService.updateAiDetails(eventType,Animal_Tag_Number);
	}

}
