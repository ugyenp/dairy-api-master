package bt.gov.ditt.dairy.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bt.gov.ditt.dairy.model.EventType;
import bt.gov.ditt.dairy.repository.EventTypeRepository;

@Service
public class EventTypeService {
	
	@Autowired
	private EventTypeRepository eventTypeRepository;

	public List<EventType> getEvents() {
		List<EventType> eventType = new ArrayList<>();
		eventTypeRepository.findAll().forEach(eventType::add);
		return eventType;
	}

	public Optional<Object> updateAiDetails(EventType eventType, String animal_Tag_Number) {
		return eventTypeRepository.findById(animal_Tag_Number).map(x -> {
			x.setType_Of_Event(eventType.getType_Of_Event());
			x.setType_Of_Assited_Formula(eventType.getType_Of_Assited_Formula());
			x.setDate_Of_Pd_Status(eventType.getDate_Of_Pd_Status());
			x.setRemarks(eventType.getRemarks());
			return eventTypeRepository.save(x);
		});
	}

}
