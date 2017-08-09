package rockersModel;


public class Employee 
{
	String name;
	long wiproID;
	long clientID;
	String wiproEmail;
	User user;
	
	public Employee(String name, long wiproID, long clientID, String wiproEmail, User user) 
	{
		this.name = name;
		this.wiproID = wiproID;
		this.clientID = clientID;
		this.wiproEmail = wiproEmail;
		this.user = user;
	}
	
	public User getUser() 
	{
		return user;
	}	

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public long getWiproID() 
	{
		return wiproID;
	}
	
	public void setWiproID(long wiproID) 
	{
		this.wiproID = wiproID;
	}
	
	public long getClientID() 
	{
		return clientID;
	}
	
	public void setClientID(long clientID) 
	{
		this.clientID = clientID;
	}
	
	public String getWiproEmail() 
	{
		return wiproEmail;
	}
	
	public void setWiproEmail(String wiproEmail) 
	{
		this.wiproEmail = wiproEmail;
	}
}
