package bt.gov.ditt.dairy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_village_lookup")
public class VillageLookup {
	
	@Id
	private int Village_Serial_No;
	private String Village_Name;
	private int Gewog_Serial_No;
	
	public VillageLookup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VillageLookup(int village_Serial_No, String village_Name, int gewog_Serial_No) {
		super();
		Village_Serial_No = village_Serial_No;
		Village_Name = village_Name;
		Gewog_Serial_No = gewog_Serial_No;
	}

	public int getVillage_Serial_No() {
		return Village_Serial_No;
	}

	public void setVillage_Serial_No(int village_Serial_No) {
		Village_Serial_No = village_Serial_No;
	}

	public String getVillage_Name() {
		return Village_Name;
	}

	public void setVillage_Name(String village_Name) {
		Village_Name = village_Name;
	}

	public int getGewog_Serial_No() {
		return Gewog_Serial_No;
	}

	public void setGewog_Serial_No(int gewog_Serial_No) {
		Gewog_Serial_No = gewog_Serial_No;
	}

	
	
}
