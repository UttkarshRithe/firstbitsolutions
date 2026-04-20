package ArraylistDao;

import java.util.ArrayList;

import model.Admin;
import model.Employee;
import model.HR;
import model.SalesMAnager;

public class ArrayListDao {
	
	ArrayList emplist = new ArrayList();
	
	public boolean addEmployee(Employee e) {
		if(emplist.add(e))
		{
			 return true;
		}
		else
		{
			 return false;
		}
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

	public boolean updatecommision(int id, double comission) {
		for(int i=0;i<emplist.size();i++)
		{
			if(((HR)emplist.get(i)).getEmployeeId()==id)
			{
			((HR) emplist.get(i)).setComission(comission);
			return true;
			}
		}
		return false;
	}

	public boolean updateAllowance(int id, double allowance) {
		for(int i=0;i<emplist.size();i++)
		{
			if(((Admin)emplist.get(i)).getEmployeeId()==id)
			{
			((Admin) emplist.get(i)).setAllowance(allowance);
			return true;
			}
		}
		return false;
	}

	public boolean updateIncentive(int id, double incentive) {
		for(int i=0;i<emplist.size();i++)
		{
			if(((SalesMAnager)emplist.get(i)).getEmployeeId()==id)
			{
			((SalesMAnager) emplist.get(i)).setIncentive(incentive);
			return true;
			}
		}
		return false;
	}

	public boolean updateTarget(int id, int target) {
		for(int i=0;i<emplist.size();i++)
		{
			if(((SalesMAnager)emplist.get(i)).getEmployeeId()==id)
			{
			((SalesMAnager) emplist.get(i)).setTarger(target);
			return true;
			}
		}
		return false;
	}

}
