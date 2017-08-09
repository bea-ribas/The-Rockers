package rockersModel;

import java.util.ArrayList;
import java.util.List;

public class Contract 
{
	String projectType;
	List<Team> employee = new ArrayList<Team>();
	
	public Contract(String projectType, List<Team> employee) 
	{
		this.projectType = projectType;
		this.employee = employee;
	}

	public String getProjectType() 
	{
		return projectType;
	}

	public void setProjectType(String projectType) 
	{
		this.projectType = projectType;
	}
}
