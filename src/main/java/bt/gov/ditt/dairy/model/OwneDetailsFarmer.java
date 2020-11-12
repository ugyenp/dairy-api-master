package bt.gov.ditt.dairy.model;

import javax.persistence.*;

@Entity
@Table(name = "application_table")
public class OwneDetailsFarmer {
	
	@Id
	@Column(name = "CID_Number")
	private String cidNumber;
	
	@Column(name = "Farmer_Name")
	private String farmerName;
	
	@Column(name = "Village_Name")
	private String village;
	
	@Column(name = "Gewog_Name")
	private String gewog;
	
	@Column(name = "Dzongkhag_Name")
	private String dzongkhag;
	
	@Column(name = "Mobile_Number")
	private String mobileNumber;
	
	@Column(name = "Housing_Type")
	private String housingType;
	
	
	public OwneDetailsFarmer() {
		super();
	}
	
	
	public OwneDetailsFarmer(String cidNumber, String farmerName, String village, String gewog, String dzongkhag,
			String mobileNumber, String housingType) {
		super();
		this.cidNumber = cidNumber;
		this.farmerName = farmerName;
		this.village = village;
		this.gewog = gewog;
		this.dzongkhag = dzongkhag;
		this.mobileNumber = mobileNumber;
		this.housingType = housingType;
	}
	
	public String getCidNumber() {
		return cidNumber;
	}
	public void setCidNumber(String cidNumber) {
		this.cidNumber = cidNumber;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getHousingType() {
		return housingType;
	}
	public void setHousingType(String housingType) {
		this.housingType = housingType;
	}
	
	
}
