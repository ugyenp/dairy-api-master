package bt.gov.ditt.dairy.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "ai_ns_table")
public class AiNs {

	@Id
	private String Animal_Tag_Number;
	private int User_Gewog_Id;
	private String Technique_Name;
	private String Semen_Type;
	private Date Date_Of_Event;
	private String Bull_Name;
	private String Bull_Number;
	private float Bull_Exotic;
	private int Bull_Breed_Type_Id;
	private int AI_Center_Id;
	private String Technician_Name;
	private String AI_Technician_Type;
	private Date PD_Date;
	private float Latitude;
	private float Longitude;
	private float Altitude;
	private String PD_Status;
	private String Breeding_Status;
	private Date PD_Status_Date;
	private String Type_Of_Event;
	private Date Date_Of_Pd_Status;
	private String Type_Of_Assited_Formula;
	private String Remarks;
	
	public AiNs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AiNs(String animal_Tag_Number, int user_Gewog_Id, String technique_Name, String semen_Type,
			Date date_Of_Event, String bull_Name, String bull_Number, float bull_Exotic, int bull_Breed_Type_Id,
			int aI_Center_Id, String technician_Name, String aI_Technician_Type, Date pD_Date, float latitude,
			float longitude, float altitude, String pD_Status, String breeding_Status, Date pD_Status_Date,
			String type_Of_Event, Date date_Of_Pd_Status, String type_Of_Assited_Formula, String remarks) {
		super();
		Animal_Tag_Number = animal_Tag_Number;
		User_Gewog_Id = user_Gewog_Id;
		Technique_Name = technique_Name;
		Semen_Type = semen_Type;
		Date_Of_Event = date_Of_Event;
		Bull_Name = bull_Name;
		Bull_Number = bull_Number;
		Bull_Exotic = bull_Exotic;
		Bull_Breed_Type_Id = bull_Breed_Type_Id;
		AI_Center_Id = aI_Center_Id;
		Technician_Name = technician_Name;
		AI_Technician_Type = aI_Technician_Type;
		PD_Date = pD_Date;
		Latitude = latitude;
		Longitude = longitude;
		Altitude = altitude;
		PD_Status = pD_Status;
		Breeding_Status = breeding_Status;
		PD_Status_Date = pD_Status_Date;
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

	public int getUser_Gewog_Id() {
		return User_Gewog_Id;
	}

	public void setUser_Gewog_Id(int user_Gewog_Id) {
		User_Gewog_Id = user_Gewog_Id;
	}

	public String getTechnique_Name() {
		return Technique_Name;
	}

	public void setTechnique_Name(String technique_Name) {
		Technique_Name = technique_Name;
	}

	public String getSemen_Type() {
		return Semen_Type;
	}

	public void setSemen_Type(String semen_Type) {
		Semen_Type = semen_Type;
	}

	public Date getDate_Of_Event() {
		return Date_Of_Event;
	}

	public void setDate_Of_Event(Date date_Of_Event) {
		Date_Of_Event = date_Of_Event;
	}

	public String getBull_Name() {
		return Bull_Name;
	}

	public void setBull_Name(String bull_Name) {
		Bull_Name = bull_Name;
	}

	public String getBull_Number() {
		return Bull_Number;
	}

	public void setBull_Number(String bull_Number) {
		Bull_Number = bull_Number;
	}

	public float getBull_Exotic() {
		return Bull_Exotic;
	}

	public void setBull_Exotic(float bull_Exotic) {
		Bull_Exotic = bull_Exotic;
	}

	public int getBull_Breed_Type_Id() {
		return Bull_Breed_Type_Id;
	}

	public void setBull_Breed_Type_Id(int bull_Breed_Type_Id) {
		Bull_Breed_Type_Id = bull_Breed_Type_Id;
	}

	public int getAI_Center_Id() {
		return AI_Center_Id;
	}

	public void setAI_Center_Id(int aI_Center_Id) {
		AI_Center_Id = aI_Center_Id;
	}

	public String getTechnician_Name() {
		return Technician_Name;
	}

	public void setTechnician_Name(String technician_Name) {
		Technician_Name = technician_Name;
	}

	public String getAI_Technician_Type() {
		return AI_Technician_Type;
	}

	public void setAI_Technician_Type(String aI_Technician_Type) {
		AI_Technician_Type = aI_Technician_Type;
	}

	public Date getPD_Date() {
		return PD_Date;
	}

	public void setPD_Date(Date pD_Date) {
		PD_Date = pD_Date;
	}

	public float getLatitude() {
		return Latitude;
	}

	public void setLatitude(float latitude) {
		Latitude = latitude;
	}

	public float getLongitude() {
		return Longitude;
	}

	public void setLongitude(float longitude) {
		Longitude = longitude;
	}

	public float getAltitude() {
		return Altitude;
	}

	public void setAltitude(float altitude) {
		Altitude = altitude;
	}

	public String getPD_Status() {
		return PD_Status;
	}

	public void setPD_Status(String pD_Status) {
		PD_Status = pD_Status;
	}

	public String getBreeding_Status() {
		return Breeding_Status;
	}

	public void setBreeding_Status(String breeding_Status) {
		Breeding_Status = breeding_Status;
	}

	public Date getPD_Status_Date() {
		return PD_Status_Date;
	}

	public void setPD_Status_Date(Date pD_Status_Date) {
		PD_Status_Date = pD_Status_Date;
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
