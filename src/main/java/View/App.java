package View;

import Controller.Register;
import rockersModel.Employee;
import rockersModel.Singleton;

public class App {

	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		
		Employee employee = new Employee();
		Register register = new Register();
		
		employee.setName("Beatriz");
		employee.setClientID("");
		employee.setWiproEmail("beatriz@wipro.com");
		employee.setWiproID(instance.getWiproId());
		
		register.addEmployee(employee);
	}

}