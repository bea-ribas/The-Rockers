package Controller;

import java.util.HashSet;
import java.util.Set;

import rockersModel.Employee;

public class Register {
	
	private Set<Employee> employees = new HashSet<Employee>();
	
	public void addEmployee(Employee employee) {
		
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		
		employees.remove(employee);
	}

	public Set<Employee> getEmployees() {
		
		return employees;
	}
}