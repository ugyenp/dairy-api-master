package bt.gov.ditt.dairy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_application_sequence")
public class ApplicationSequence {
	@Id
	@Column(name="Service_Id")
	private int serviceId;
	@Column(name = "Last_Application_Number")
	private int lastApplicationNumber;
	
	public ApplicationSequence() {
		super();
		
	}
	
	public ApplicationSequence(int serviceId, int lastApplicationNumber) {
		super();
		this.serviceId = serviceId;
		this.lastApplicationNumber = lastApplicationNumber;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getLastApplicationNumber() {
		return lastApplicationNumber;
	}
	public void setLastApplicationNumber(int lastApplicationNumber) {
		this.lastApplicationNumber = lastApplicationNumber;
	}
	
	@Override
    public String toString() {
        return "ApplicationSequence [serviceId=" + serviceId + ", lastApplicationNumber="  + lastApplicationNumber +"]";
    }
  
}
