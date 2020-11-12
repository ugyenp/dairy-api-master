package bt.gov.ditt.dairy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "government_farm_details")
public class GovernmentFarmDetails {

	@Id
	@Column(name = "Farm_NLHN")
	private String nlhdNumber;
	@Column(name = "Farm_Name")
	private String name;
	@Column(name = "Village")
	private String village;
	@Column(name = "Geog")
	private String gewog;
	@Column(name = "Dzongkhag")
	private String dzongkhag;
	
	
	
	public GovernmentFarmDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public GovernmentFarmDetails(String nlhdNumber, String name, String village, String gewog, String dzongkhag) {
		super();
		this.nlhdNumber = nlhdNumber;
		this.name = name;
		this.village = village;
		this.gewog = gewog;
		this.dzongkhag = dzongkhag;
	}
	public String getNlhdNumber() {
		return nlhdNumber;
	}
	public void setNlhdNumber(String nlhdNumber) {
		this.nlhdNumber = nlhdNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getGewog() {
		return gewog;
	}
	public void setGewog(String gewog) {
		this.gewog = gewog;
	}
	public String getDzongkhag() {
		return dzongkhag;
	}
	public void setDzongkhag(String dzongkhag) {
		this.dzongkhag = dzongkhag;
	}
	
	
	
}
