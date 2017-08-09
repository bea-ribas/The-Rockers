package rockersModel;

import java.util.ArrayList;
import java.util.List;

public class Team 
{
	String teamName;
	List<Employee> employee = new ArrayList<Employee>();

	
	public Team(String teamName, List<Employee> employee)
	{
		this.teamName = teamName;
		this.employee = employee;
	}

	public String getTeamName() 
	{
		return teamName;
	}

	public void setTeamName(String teamName) 
	{
		this.teamName = teamName;
	}

	public List<Employee> getEmployee() 
	{
		return employee;
	}

	public void setEmployee(List<Employee> employee) 
	{
		this.employee = employee;
	}
}
