package bt.gov.ditt.dairy.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ai_ns_table")
public class ArtificalInsemination {
	@Id
	private String Animal_Tag_Number;
	private String Semen_Type;
	private Date Date_Of_Event;
	private String Bull_Number;
	private String Bull_Name;
	private float Bull_Exotic;
	private int Bull_Breed_Type_Id;
	private String Technician_Name;
	private int AI_Center_Id;
	private String AI_Technician_Type;
	private float Longitude;
	private float Latitude;
	private String Technique_Name;
	
	@ManyToOne(targetEntity = BreedType.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "Bull_Breed_Type_Id",referencedColumnName = "Breed_Type_Id",insertable=false,updatable=false)
	  private BreedType breed;
	
	@ManyToOne(targetEntity = AiCenterMaster.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "AI_Center_Id",referencedColumnName = "AI_Center_Id",insertable=false,updatable=false)
	  private AiCenterMaster aicenter;
	
	

	public ArtificalInsemination() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ArtificalInsemination(String animal_Tag_Number, String semen_Type, Date date_Of_Event, String bull_Number,
			String bull_Name, float bull_Exotic, int bull_Breed_Type_Id, String technician_Name, int aI_Center_Id,
			String aI_Technician_Type, float longitude, float latitude, String technique_Name, BreedType breed,
			AiCenterMaster aicenter) {
		super();
		Animal_Tag_Number = animal_Tag_Number;
		Semen_Type = semen_Type;
		Date_Of_Event = date_Of_Event;
		Bull_Number = bull_Number;
		Bull_Name = bull_Name;
		Bull_Exotic = bull_Exotic;
		Bull_Breed_Type_Id = bull_Breed_Type_Id;
		Technician_Name = technician_Name;
		AI_Center_Id = aI_Center_Id;
		AI_Technician_Type = aI_Technician_Type;
		Longitude = longitude;
		Latitude = latitude;
		Technique_Name = technique_Name;
		this.breed = breed;
		this.aicenter = aicenter;
	}



	public String getAnimal_Tag_Number() {
		return Animal_Tag_Number;
	}



	public void setAnimal_Tag_Number(String animal_Tag_Number) {
		Animal_Tag_Number = animal_Tag_Number;
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



	public String getTechnician_Name() {
		return Technician_Name;
	}



	public void setTechnician_Name(String technician_Name) {
		Technician_Name = technician_Name;
	}



	public int getAI_Center_Id() {
		return AI_Center_Id;
	}



	public void setAI_Center_Id(int aI_Center_Id) {
		AI_Center_Id = aI_Center_Id;
	}



	public String getAI_Technician_Type() {
		return AI_Technician_Type;
	}



	public void setAI_Technician_Type(String aI_Technician_Type) {
		AI_Technician_Type = aI_Technician_Type;
	}



	public float getLongitude() {
		return Longitude;
	}



	public void setLongitude(float longitude) {
		Longitude = longitude;
	}



	public float getLatitude() {
		return Latitude;
	}



	public void setLatitude(float latitude) {
		Latitude = latitude;
	}



	public String getTechnique_Name() {
		return Technique_Name;
	}



	public void setTechnique_Name(String technique_Name) {
		Technique_Name = technique_Name;
	}



	public BreedType getBreed() {
		return breed;
	}



	public void setBreed(BreedType breed) {
		this.breed = breed;
	}



	public AiCenterMaster getAicenter() {
		return aicenter;
	}



	public void setAicenter(AiCenterMaster aicenter) {
		this.aicenter = aicenter;
	}

	

}
