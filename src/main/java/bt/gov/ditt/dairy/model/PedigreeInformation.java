package bt.gov.ditt.dairy.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="application_table")
public class PedigreeInformation {
	
	@Id
	@Column(name="Animal_Tag_Number")
	private String animalTaggNumber;
	@Column(name="Name_Of_Animal")
	private String animalName;
	@Column(name = "Breed_Type")
	private String animalBreed;
	@Column(name="Exotic_Blood_Percent")
	private float animalExotic;
	
	@ManyToOne(targetEntity = BreedType.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "Breed_Type",referencedColumnName = "Breed_Type_Id",insertable=false,updatable=false)
	  private BreedType breed;
	
	

	public PedigreeInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PedigreeInformation(String animalTaggNumber, String animalName, String animalBreed, float animalExotic,
			BreedType breed) {
		super();
		this.animalTaggNumber = animalTaggNumber;
		this.animalName = animalName;
		this.animalBreed = animalBreed;
		this.animalExotic = animalExotic;
		this.breed = breed;
	}

	public String getAnimalTaggNumber() {
		return animalTaggNumber;
	}

	public void setAnimalTaggNumber(String animalTaggNumber) {
		this.animalTaggNumber = animalTaggNumber;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalBreed() {
		return animalBreed;
	}

	public void setAnimalBreed(String animalBreed) {
		this.animalBreed = animalBreed;
	}

	public float getAnimalExotic() {
		return animalExotic;
	}

	public void setAnimalExotic(float animalExotic) {
		this.animalExotic = animalExotic;
	}

	public BreedType getBreed() {
		return breed;
	}

	public void setBreed(BreedType breed) {
		this.breed = breed;
	}
	
	

}
