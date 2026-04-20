package p2;

import p1.Employee;


public class SalesManager extends Employee {
	double incentive;
	int target;
	public SalesManager(int id, String name, double salary,double incentive, int target) {
		super(id,name,salary);
		this.incentive = incentive;
		this.target = target;
	}
	
	public SalesManager() {
		super();
		this.incentive=00;
		this.target = 0;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	@Override
	public double calSalary() {
		return this.getSalary()+incentive;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nincentive=" + incentive + "\ntarget=" + target;
	}
	
}
