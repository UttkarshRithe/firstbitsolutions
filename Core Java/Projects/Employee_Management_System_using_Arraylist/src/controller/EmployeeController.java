package controller;

import java.util.ArrayList;

import ArraylistDao.ArrayListDao;
import model.Employee;


public class EmployeeController {
//	EmployeeDao ed=new EmployeeDao();
	ArrayListDao ed = new ArrayListDao();

	public boolean addEmployee(Employee e) {
		 return ed.addEmployee(e);
	}

	public Employee searchById(int id) {
		return ed.searchById(id);
		
	}

	public ArrayList getAllEmployee() {
		return ed.getAllEmployee();
	}

	public boolean updateName(int id, String str) {
		return ed.updateName(id,str);
	}

	public boolean updateSalary(int id, double salary) {
		return ed.updateSalary(id,salary);
	}

	public boolean updateComission(int id, double comission) {
		return ed.updatecommision(id,comission);
	}

	public boolean updateAllowance(int id, double allowance) {
		return ed.updateAllowance(id,allowance);
	}

	public boolean updateIncentive(int id, double incentive) {
	
		return ed.updateIncentive(id,incentive);
	}

	public boolean updateTarget(int id, int target) {
		return ed.updateTarget(id,target);
		
	}

}
