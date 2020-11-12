package bt.gov.ditt.dairy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ai_center_master")
public class AiCenterMaster {
	@Id
	private int AI_Center_Id;
	private String AI_Center_Desc;
	private String Gewog_Serial_No;
	
	public AiCenterMaster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AiCenterMaster(int aI_Center_Id, String aI_Center_Desc, String gewog_Serial_No) {
		super();
		AI_Center_Id = aI_Center_Id;
		AI_Center_Desc = aI_Center_Desc;
		Gewog_Serial_No = gewog_Serial_No;
	}

	public int getAI_Center_Id() {
		return AI_Center_Id;
	}

	public void setAI_Center_Id(int aI_Center_Id) {
		AI_Center_Id = aI_Center_Id;
	}

	public String getAI_Center_Desc() {
		return AI_Center_Desc;
	}

	public void setAI_Center_Desc(String aI_Center_Desc) {
		AI_Center_Desc = aI_Center_Desc;
	}

	public String getGewog_Serial_No() {
		return Gewog_Serial_No;
	}

	public void setGewog_Serial_No(String gewog_Serial_No) {
		Gewog_Serial_No = gewog_Serial_No;
	}
	
	

}
