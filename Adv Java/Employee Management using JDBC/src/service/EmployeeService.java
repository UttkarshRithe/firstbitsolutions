package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.EmployeeDAO;
import model.Employee;

public class EmployeeService {

	EmployeeDAO dao = new EmployeeDAO();

	public int addEmployee(Employee emp) {
		return dao.addEmployee(emp);
		
	}

	public ArrayList viewAllEmployee() {
		return dao.viewAllEmployee();
	}

	public boolean updateEmployee(int id) {
		return dao.updateEmployee(id);
	}

}