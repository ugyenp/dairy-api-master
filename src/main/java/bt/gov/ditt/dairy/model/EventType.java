package bt.gov.ditt.dairy.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ai_ns_table")
public class EventType {
	@Id
	private String  Animal_Tag_Number;
	private String Type_Of_Event;
	private Date Date_Of_Pd_Status;
	private String Type_Of_Assited_Formula;
	private String Remarks;
	
	
	
	public EventType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventType(String animal_Tag_Number, String type_Of_Event, Date date_Of_Pd_Status,
			String type_Of_Assited_Formula, String remarks) {
		super();
		Animal_Tag_Number = animal_Tag_Number;
		Type_Of_Event = type_Of_Event;
		Date_Of_Pd_Status = date_Of_Pd_Status;
		Type_Of_Assited_Formula = type_Of_Assited_Formula;
		Remarks = remarks;
	}
	
	public String getAnimal_Tag_Number() {
		return Animal_Tag_Number;
	}
	public void setAnimal_Tag_Number(String animal_Tag_Number) {
		Animal_Tag_Number = animal_Tag_Number;
	}
	public String getType_Of_Event() {
		return Type_Of_Event;
	}
	public void setType_Of_Event(String type_Of_Event) {
		Type_Of_Event = type_Of_Event;
	}
	public Date getDate_Of_Pd_Status() {
		return Date_Of_Pd_Status;
	}
	public void setDate_Of_Pd_Status(Date date_Of_Pd_Status) {
		Date_Of_Pd_Status = date_Of_Pd_Status;
	}
	public String getType_Of_Assited_Formula() {
		return Type_Of_Assited_Formula;
	}
	public void setType_Of_Assited_Formula(String type_Of_Assited_Formula) {
		Type_Of_Assited_Formula = type_Of_Assited_Formula;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	
	

}
