package bt.gov.ditt.dairy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exotic_blood_master")
public class ExotiocBloodMaster {
	@Id
	@Column(name = "Sl_No")
	private int slNumber;
	@Column(name = "Exotic_Blood")
	private float exoticBlood;
	
	
	public ExotiocBloodMaster() {
		super();
	}

	public ExotiocBloodMaster(int slNumber, float exoticBlood) {
		super();
		this.slNumber = slNumber;
		this.exoticBlood = exoticBlood;
	}
	
	public int getSlNumber() {
		return slNumber;
	}
	public void setSlNumber(int slNumber) {
		this.slNumber = slNumber;
	}
	public float getExoticBlood() {
		return exoticBlood;
	}
	public void setExoticBlood(float exoticBlood) {
		this.exoticBlood = exoticBlood;
	}
	
	

}
