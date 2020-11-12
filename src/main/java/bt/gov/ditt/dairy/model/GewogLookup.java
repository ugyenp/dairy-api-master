package bt.gov.ditt.dairy.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_gewog_lookup")
public class GewogLookup {

	@Id
	private int Gewog_Serial_No;
	private String Gewog_Name;
	
	@OneToMany(targetEntity = VillageLookup.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "Gewog_Serial_No",referencedColumnName = "Gewog_Serial_No")
	  private List<VillageLookup> villageJoin;
	
	@OneToMany(targetEntity = AiCenterMaster.class,cascade = CascadeType.ALL)
	  @JoinColumn(name = "Gewog_Serial_No",referencedColumnName = "Gewog_Serial_No")
	  private List<AiCenterMaster> aiCenterJoin;
	
	public GewogLookup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GewogLookup(int gewog_Serial_No, String gewog_Name, List<VillageLookup> villageJoin,
			List<AiCenterMaster> aiCenterJoin) {
		super();
		Gewog_Serial_No = gewog_Serial_No;
		Gewog_Name = gewog_Name;
		this.villageJoin = villageJoin;
		this.aiCenterJoin = aiCenterJoin;
	}

	public int getGewog_Serial_No() {
		return Gewog_Serial_No;
	}

	public void setGewog_Serial_No(int gewog_Serial_No) {
		Gewog_Serial_No = gewog_Serial_No;
	}

	public String getGewog_Name() {
		return Gewog_Name;
	}

	public void setGewog_Name(String gewog_Name) {
		Gewog_Name = gewog_Name;
	}

	public List<VillageLookup> getVillageJoin() {
		return villageJoin;
	}

	public void setVillageJoin(List<VillageLookup> villageJoin) {
		this.villageJoin = villageJoin;
	}

	public List<AiCenterMaster> getAiCenterJoin() {
		return aiCenterJoin;
	}

	public void setAiCenterJoin(List<AiCenterMaster> aiCenterJoin) {
		this.aiCenterJoin = aiCenterJoin;
	}

	
}
