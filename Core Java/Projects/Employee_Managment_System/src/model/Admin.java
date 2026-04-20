package model;

public class Admin extends Employee {

	double allowance;

	public Admin(int employeeId, String employeeName, double salary, double allowance) {
		super(employeeId, employeeName, salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return super.toString()+"\nallowance=" + allowance;
	}
	

}
