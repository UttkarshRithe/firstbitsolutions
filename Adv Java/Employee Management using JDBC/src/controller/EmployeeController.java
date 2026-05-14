package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import service.EmployeeService;

public class EmployeeController {

	EmployeeService es = new EmployeeService();

	public int addEmployee(Employee emp) {
		return es.addEmployee(emp);
	}

	public ArrayList viewAllEmployee() {
		return es.viewAllEmployee() ;
	}

	public boolean updateEmployee(int id) {
		return es.updateEmployee(id);
		
		
	}

	
}