package Controller;

import DAO.EmployeeDAO;
import Model.Employee;
import java.util.List;

public class EmployeeController {

    EmployeeDAO dao;

    public EmployeeController() {
        dao = new EmployeeDAO(); // manual object
    }

    public boolean addEmployee(Employee e) {
        return dao.addEmployee(e);
    }

    public List<Employee> getAllEmployees() {
        return dao.getAllEmployees();
    }
}