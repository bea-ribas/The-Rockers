package Controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import rockersModel.Employee;
import rockersModel.Singleton;

public class Register {
	
	private Set<Employee> employees = new HashSet<Employee>();
	
	public void addEmployee(Employee employee) {
		
		Singleton instance = Singleton.getInstance();
		
		employee.setWiproID(instance.getWiproId());
		
		employees.add(employee);
		notifyManager();
	}
	
	public void removeEmployee(Employee employee) {
		
		employees.remove(employee);
	}

	public Set<Employee> getEmployees() {
		
		return employees;
	}
 
	public void notifyManager() {
		//TODO: implement send email to manager
	}
}