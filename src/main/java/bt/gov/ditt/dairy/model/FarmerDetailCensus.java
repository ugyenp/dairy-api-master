package bt.gov.ditt.dairy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FarmerDetailCensus {
	@Id
	private String cid_number;
	private String name;
	private String village;
	private String gewog;
	private String dzongkhag;
	
	

	public FarmerDetailCensus() {
		super();
		
	}
	
	
	public FarmerDetailCensus(String cid_number, String name, String village, String gewog, String dzongkhag) {
		super();
		this.cid_number = cid_number;
		this.name = name;
		this.village = village;
		this.gewog = gewog;
		this.dzongkhag = dzongkhag;
	}
	
	public String getCid_number() {
		return cid_number;
	}
	public void setCid_number(String cid_number) {
		this.cid_number = cid_number;
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
	
	@Override
	public String toString() {
		return String.format("FarmerDetailCensus [cid_number=%s]", cid_number);
	
	}

}
