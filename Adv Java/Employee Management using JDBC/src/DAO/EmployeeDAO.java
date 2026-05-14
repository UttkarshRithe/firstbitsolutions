package DAO;

import java.sql.*;
import java.util.*;

import DBConnnection.DbConnection;
import model.Employee;

public class EmployeeDAO {
	
	DbConnection dbs = new DbConnection();

	public int addEmployee(Employee emp) {
		
		
		Connection conn=	dbs.getDBConnection();
		
		try {
			int id =emp.getId();
			String name=emp.getName();
			double salary=emp.getSalary();
			Statement stmt = conn.createStatement();
			String query = "insert into employee values("
			        + emp.getId() + ",'"
			        + emp.getName() + "',"
			        + emp.getSalary() + ")";
	            int rows = stmt.executeUpdate(query);
			return rows;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;	
	}

	public ArrayList viewAllEmployee() {
		
		Connection conn = dbs.getDBConnection();
		
		try {
			Statement stmt =conn.createStatement();
			ResultSet res =stmt.executeQuery("select * from employee");
			ArrayList emplist = new ArrayList();
			while(res.next())
			{
				int id = (int) res.getObject(1);
				String name = res.getString(2);
				double salary = res.getDouble(3);
				
				Employee emp = new Employee(id, name, salary);
				emplist.add(emp);
			}
			
			return emplist;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	public boolean updateEmployee(int id) {
		Connection conn = dbs.getDBConnection();
		
		return false;
	}

	 
	
}