package rockersModel;

import java.util.HashSet;
import java.util.Set;

public class Team {
	
	private String teamName;
	private Set<Employee> employees = new HashSet<Employee>();

	
	public Team(String teamName, Set<Employee> employee){
		
		this.teamName = teamName;
		this.employees = employee;
	}

	public String getTeamName() {
		
		return teamName;
	}

	public void setTeamName(String teamName) {
		
		this.teamName = teamName;
	}

	public Set<Employee> getEmployee() {
		
		return employees;
	}

	public void setEmployee(Set<Employee> employee) {
		
		this.employees = employee;
	}
}
