package rockersModel;

import java.util.Set;

import Controller.Register;

public class Employee {
	
	private String name;
	private Long wiproID;
	private String clientID;
	private String wiproEmail;
	private User user;
	
	private Register register;
	
	public Employee() {
		
		//this.name = name;
		//this.clientID = clientID;
		//this.wiproEmail = wiproEmail;
		//this.user = user;
	}
	
	public void registerMe() {
		
		//TODO: implement me  
	}
	
	public Set<Employee> listCollegues(){
		
		return register.getEmployees();
	}
	
	public User getUser() {
		
		return user;
	}	

	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public Long getWiproID() {
		
		return wiproID;
	}
	
	public void setWiproID(Long wiproID) {
		
		this.wiproID = wiproID;
	}
	
	public String getClientID() {
		
		return clientID;
	}
	
	public void setClientID(String clientID) {
		
		this.clientID = clientID;
	}
	
	public String getWiproEmail() {
		
		return wiproEmail;
	}
	
	public void setWiproEmail(String wiproEmail) {
		
		this.wiproEmail = wiproEmail;
	}
}