package model;

public class HR extends Employee {

	double comission;
	
	public HR(int employeeId, String employeeName, double salary, double comission) {
		super(employeeId, employeeName, salary);
		this.comission = comission;
	}

	public double getComission() {
		return comission;
	}

	public void setComission(double comission) {
		this.comission = comission;
	}

	@Override
	public String toString() {
		return super.toString()+"\ncomission=" + comission;
	}
}
