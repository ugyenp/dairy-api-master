package bt.gov.ditt.dairy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_breed_type_master")
public class BreedType {

	@Id
	@Column(name = "Breed_Type_Id")
	private int breedId;
	@Column(name = "Breed_Type")
	private String breedType;
	
	public BreedType() {
		super();
		
	}
	
	public BreedType(int breedId, String breedType) {
		super();
		this.breedId = breedId;
		this.breedType = breedType;
	}
	public int getBreedId() {
		return breedId;
	}
	public void setBreedId(int breedId) {
		this.breedId = breedId;
	}
	public String getBreedType() {
		return breedType;
	}
	public void setBreedType(String breedType) {
		this.breedType = breedType;
	}
	
}
