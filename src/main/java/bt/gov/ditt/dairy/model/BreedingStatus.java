package bt.gov.ditt.dairy.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ai_ns_table")
public class BreedingStatus {
	@Id
	private String Animal_Tag_Number;
	private String Breeding_Status;
    private String PD_Status;
	private Date PD_Status_Date;
	
	public BreedingStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BreedingStatus(String animal_Tag_Number, String breeding_Status, String pD_Status, Date pD_Status_Date) {
		super();
		Animal_Tag_Number = animal_Tag_Number;
		Breeding_Status = breeding_Status;
		PD_Status = pD_Status;
		PD_Status_Date = pD_Status_Date;
	}

	public String getAnimal_Tag_Number() {
		return Animal_Tag_Number;
	}

	public void setAnimal_Tag_Number(String animal_Tag_Number) {
		Animal_Tag_Number = animal_Tag_Number;
	}

	public String getBreeding_Status() {
		return Breeding_Status;
	}

	public void setBreeding_Status(String breeding_Status) {
		Breeding_Status = breeding_Status;
	}

	public String getPD_Status() {
		return PD_Status;
	}

	public void setPD_Status(String pD_Status) {
		PD_Status = pD_Status;
	}

	public Date getPD_Status_Date() {
		return PD_Status_Date;
	}

	public void setPD_Status_Date(Date pD_Status_Date) {
		PD_Status_Date = pD_Status_Date;
	}
	
	

}
