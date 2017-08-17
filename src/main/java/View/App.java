package View;

import Controller.Register;
import rockersModel.Employee;

public class App {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Register register = new Register();
		
		employee.setName("Beatriz");
		employee.setClientID("");
		employee.setWiproEmail("beatriz@wipro.com");
		employee.setWiproID(385990L);
		register.addEmployee(employee);
	}
}