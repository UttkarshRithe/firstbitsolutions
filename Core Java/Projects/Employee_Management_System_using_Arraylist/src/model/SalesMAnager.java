package model;

public class SalesMAnager extends Employee {

	double incentive;
	int targer;
	public SalesMAnager(int employeeId, String employeeName, double salary, double incentive, int targer) {
		super(employeeId, employeeName, salary);
		this.incentive = incentive;
		this.targer = targer;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	public int getTarger() {
		return targer;
	}
	public void setTarger(int targer) {
		this.targer = targer;
	}
	@Override
	public String toString() {
		return super.toString()+ "\nincentive=" + incentive + "\ntarger=" + targer;
	}
}
