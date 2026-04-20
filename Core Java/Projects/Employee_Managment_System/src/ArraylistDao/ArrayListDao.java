package ArraylistDao;

import java.util.ArrayList;

import model.Employee;

public class ArrayListDao {
	
	ArrayList emplist;
	
	public boolean addEmployee(Employee e) {
		return emplist.add(e);
	}
	
	public Employee searchById(int id) {
			for(int i=0;i<emplist.size();i++)
			{
				if(((Employee) emplist.get(i)).getEmployeeId()==id)
					return (Employee) emplist.get(i);
			}
		return null;
	}

	
	public ArrayList getAllEmployee() {
		return emplist;
	}

	public boolean updateName(int id, String str) {
		for(int i=0;i<emplist.size();i++)
		{
			if(((Employee) emplist.get(i)).getEmployeeId()==id)
			{
				((Employee) emplist.get(i)).setEmployeeName(str);
				return true;
			}
		}
		return false;
	}

	public boolean updateSalary(int id, double salary) {
		for(int i=0;i<emplist.size();i++)
		{
			if(((Employee) emplist.get(i)).getEmployeeId()==id)
			{
				((Employee) emplist.get(i)).setSalary(salary);
				return true;
			}
		}
		return false;
	}

}
