class Employee
{
	String name;
	double basicSalary;
	static double bonusRate=20;
	
	Employee() {
		this.name="not given";
		this.basicSalary=000;
	}
	Employee(String name, double basicSalary) {
	
		this.name = name;
		this.basicSalary = basicSalary;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getBasicSalary() {
		return basicSalary;
	}
	void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	static double getBonusRate() {
		return bonusRate;
	}
	static void setBonusRate(double bonusRate) {
		Employee.bonusRate = bonusRate;
	}
	void display()
	{
		System.out.println("name:"+this.name);
		System.out.println("Basic salary:"+this.basicSalary);
	}
	
	double TotalSalary()
	{
		double TotalSalary = this.basicSalary +(this.basicSalary*Employee.bonusRate/100);
		return TotalSalary;
	}
}
public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("Yash",20000);
		e1.display();
		System.out.println("Bonus Rate:"+Employee.bonusRate);
		System.out.println("Total Salary:"+e1.TotalSalary());

	}

}
