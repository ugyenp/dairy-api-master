package bt.gov.ditt.dairy.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ai_ns_table")
public class UpdateAiNs {

	@Id
	private String Animal_Tag_Number;
	private Date Date_Of_Event;
	private String Semen_Type;
	private String Bull_Number;
	private String Bull_Name;
	
	public UpdateAiNs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UpdateAiNs(String animal_Tag_Number, Date date_Of_Event, String semen_Type, String bull_Number,
			String bull_Name) {
		super();
		Animal_Tag_Number = animal_Tag_Number;
		Date_Of_Event = date_Of_Event;
		Semen_Type = semen_Type;
		Bull_Number = bull_Number;
		Bull_Name = bull_Name;
	}

	public String getAnimal_Tag_Number() {
		return Animal_Tag_Number;
	}

	public void setAnimal_Tag_Number(String animal_Tag_Number) {
		Animal_Tag_Number = animal_Tag_Number;
	}

	public Date getDate_Of_Event() {
		return Date_Of_Event;
	}

	public void setDate_Of_Event(Date date_Of_Event) {
		Date_Of_Event = date_Of_Event;
	}

	public String getSemen_Type() {
		return Semen_Type;
	}

	public void setSemen_Type(String semen_Type) {
		Semen_Type = semen_Type;
	}

	public String getBull_Number() {
		return Bull_Number;
	}

	public void setBull_Number(String bull_Number) {
		Bull_Number = bull_Number;
	}

	public String getBull_Name() {
		return Bull_Name;
	}

	public void setBull_Name(String bull_Name) {
		Bull_Name = bull_Name;
	}

	
}
