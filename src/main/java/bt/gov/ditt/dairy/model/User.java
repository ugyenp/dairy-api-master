package bt.gov.ditt.dairy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private int id;
	private String userName;
	private String password;
	//private boolean active;
	private String roles;
	private int user_location_id;
	private String user_location_name;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String userName, String password, String roles, int user_location_id,
			String user_location_name) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.roles = roles;
		this.user_location_id = user_location_id;
		this.user_location_name = user_location_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public int getUser_location_id() {
		return user_location_id;
	}

	public void setUser_location_id(int user_location_id) {
		this.user_location_id = user_location_id;
	}

	public String getUser_location_name() {
		return user_location_name;
	}

	public void setUser_location_name(String user_location_name) {
		this.user_location_name = user_location_name;
	}

  
		
}
