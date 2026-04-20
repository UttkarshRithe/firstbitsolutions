package dao;

import model.Admin;
import model.Employee;
import model.HR;
import model.SalesMAnager;

public class EmployeeDao {
	int size=10;
	Employee[] arr = new Employee[size];
	int countemp=0;

	public boolean addEmployee(Employee e)
	{
		if(countemp!=size)
		{
			arr[countemp]=e;
			countemp++;
			return true;
		}
		else
		{
			return false;
		}
	}


	public Employee searchById(int id) {
		for(int i =0;i<countemp;i++)
		{
			if(arr[i].getEmployeeId()==id)
			{
				return arr[i];
			}
		}
		return null;
	}

	public Employee[] getAllEmployee()
	{
		return arr;
	}


	public boolean updateName(int id, String str) {
		for(int i=0;i<=countemp;i++)
		{
			if(arr[i].getEmployeeId()==id)
			{
				arr[i].setEmployeeName(str);
				return true;
			}
		}
		return false;
	}
	
	public boolean updateSalary(int id, double salary) {
		for(int i=0;i<=countemp;i++)
		{
			if(arr[i].getEmployeeId()==id)
			{
				arr[i].setSalary(salary);
				return true;
			}
		}
		return false;
	}


	public boolean updatecommision(int id, double comission) {
		for(int i=0;i<=countemp;i++)
		{
			
				Employee e=arr[i];
				HR h =(HR)e; 
				if(arr[i].getEmployeeId()==id)
				{
					h.setComission(comission);
					return true;
				}
		}
		return false;
	}


	public boolean updateAllowance(int id, double allowance) {
		for(int i=0;i<=countemp;i++)
		{
			
				Employee e=arr[i];
				Admin a =(Admin)e; 
				if(arr[i].getEmployeeId()==id)
				{
					a.setAllowance(allowance);
					return true;
				}
		}
		return false;
	}


	public boolean updateIncentive(int id, double incentive) {
		for(int i=0;i<=countemp;i++)
		{
			
				Employee e=arr[i];
				SalesMAnager sm =(SalesMAnager)e; 
				if(arr[i].getEmployeeId()==id)
				{
					sm.setIncentive(incentive);
					return true;
				}
		}
		return false;
	}


	public boolean updateTarget(int id, int target) {
		for(int i=0;i<=countemp;i++)
		{
			
				Employee e=arr[i];
				SalesMAnager sm =(SalesMAnager)e; 
				if(arr[i].getEmployeeId()==id)
				{
					sm.setTarger(target);
					return true;
				}
		}
		return false;
	}
}
