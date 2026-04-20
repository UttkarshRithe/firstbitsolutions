package p2;

import p1.Employee;

public class Admin extends Employee{

	double allowance;
	
	public Admin() {
		super();
		this.allowance=00;
	}
	
	public Admin(int id, String name, double salary,double allowance) {
		super(id,name,salary);
		this.allowance = allowance;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	@Override
	public double calSalary() {
	
		return this.getSalary()+allowance;
	}

	@Override
	public String toString() {
		return super.toString()+"\nallowance=" + allowance;
	}	
}
